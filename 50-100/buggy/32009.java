public void stop() {
    org.rootio.tools.utils.Utils.toastOnScreen("stopping in playlist");
    if ((mediaPlayer) != null) {
        try {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        } catch (java.lang.Exception ex) {
            android.util.Log.e(this.parent.getString(R.string.app_name), ((ex.getMessage()) == null ? "Null pointer exception(PlayList.stop)" : ex.getMessage()));
        }
    }
}