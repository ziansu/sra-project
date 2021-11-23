@java.lang.Override
protected void onPostExecute(java.lang.Long localPlayTime) {
    android.util.Log.d(TAG, "OnPostExecute");
    com.speakr.connorriley.speakr.SongTimer songtimer = new com.speakr.connorriley.speakr.SongTimer(localPlayTime, musicSrv, controller, actionstring, context);
}