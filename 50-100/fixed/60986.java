void Error(java.lang.String es) {
    java.lang.String s = java.lang.String.format("%s\n(error code: %d)", es, com.un4seen.bass.BASS.BASS_ErrorGetCode());
    runOnUiThread(new ru.itva.radiocent.BookmarkPack.BookmarksActivity.RunnableParam(s) {
        public void run() {
            ru.itva.radiocent.utils.NowPlayed.setPlay(false);
            new android.app.AlertDialog.Builder(ru.itva.radiocent.BookmarkPack.BookmarksActivity.this).setMessage(((java.lang.String) (param))).setPositiveButton("OK", null).show();
        }
    });
}