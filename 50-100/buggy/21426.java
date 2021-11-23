public void removePlayer(int position) {
    android.util.Log.e(io.github.sdsstudios.ScoreKeeper.Adapters.PlayerListAdapter.TAG, java.lang.String.valueOf(position));
    mBackupPosition = position;
    mBackupPlayer = mPlayerArray().get(position);
    mPlayerListAdapterListener.onPlayerRemove(position);
    notifyDataSetChanged();
    if ((mRelativeLayout) != null) {
        mSnackBar = android.support.design.widget.Snackbar.make(mRelativeLayout, "Player removed.", Snackbar.LENGTH_LONG).setAction("Undo", undoPlayerClickListener);
        mSnackBar.show();
    }
}