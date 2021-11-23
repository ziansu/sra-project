public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
    editor.putBoolean(Constants.PREFERENCES_SHOW_ALARM, false).commit();
    editor.putBoolean(Constants.PREFERENCES_ALREADY_RATED, true).commit();
}