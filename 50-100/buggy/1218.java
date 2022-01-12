@java.lang.Override
protected void onPause() {
    try {
        super.onPause();
        se.gsc.stenmark.gscenduro.MainActivity.disconected = true;
        android.content.SharedPreferences settings = getSharedPreferences(se.gsc.stenmark.gscenduro.MainActivity.PREF_NAME, 0);
        android.content.SharedPreferences.Editor editor = settings.edit();
        editor.putString("connectionStatus", "Disconnected");
        editor.commit();
    } catch (java.lang.Exception e1) {
        se.gsc.stenmark.gscenduro.PopupMessage dialog = new se.gsc.stenmark.gscenduro.PopupMessage(se.gsc.stenmark.gscenduro.MainActivity.generateErrorMessage(e1));
        dialog.show(getSupportFragmentManager(), "popUp");
    }
}