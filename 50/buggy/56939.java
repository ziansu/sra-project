private void CloseFile(java.lang.String file) {
    final java.lang.String musicFile = com.qsp.player.Utility.QspPathTranslate(file);
    runOnUiThread(new java.lang.Runnable() {
        public void run() {
            CloseFileUI(musicFile);
        }
    });
}