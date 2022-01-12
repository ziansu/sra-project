public void onBellSound(final java.lang.String playerId) {
    cwa115.trongame.Map.Player remotePlayer = ((cwa115.trongame.Map.Player) (map.getItemById(cwa115.trongame.Game.GameSettings.getPlayerId())));
    remotePlayer.setCustomMarker(R.mipmap.bell_marker);
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            cwa115.trongame.Map.Player me = ((cwa115.trongame.Map.Player) (map.getItemById(playerId)));
            me.resetMarker();
        }
    }, 3000);
}