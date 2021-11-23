public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
    editor.putBoolean(Constants.PREFERENCES_SHOW_ALARM, false).commit();
    editor.apply();
}