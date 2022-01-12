public void stop() {
    if ((mediaPlayer) != null) {
        try {
            mediaPlayer.stop();
            mediaPlayer.release();
        } catch (java.lang.Exception ex) {
            android.util.Log.e(this.parent.getString(R.string.app_name), ((ex.getMessage()) == null ? "Null pointer exception(PlayList.stop)" : ex.getMessage()));
        }
    }
}