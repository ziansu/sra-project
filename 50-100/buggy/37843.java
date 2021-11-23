public void onBellSound(final java.lang.String playerId) {
    cwa115.trongame.Game.Map.Player remotePlayer = ((cwa115.trongame.Game.Map.Player) (map.getItemById(playerId)));
    remotePlayer.setCustomMarker(R.mipmap.bell_marker);
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            cwa115.trongame.Game.Map.Player me = ((cwa115.trongame.Game.Map.Player) (map.getItemById(playerId)));
            me.resetMarker();
        }
    }, 3000);
}