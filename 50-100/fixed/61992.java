@java.lang.Override
public void run() {
    final com.android.systemui.qs.QSTile.State state = tile.newTileState();
    tile.getState().copyTo(state);
    state.label = tile.getTileLabel();
    mainHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            addTile(spec, null, state, true);
            mListener.onTilesChanged(mTiles);
        }
    });
}