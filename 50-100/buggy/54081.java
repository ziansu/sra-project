@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.gw150914.jabberwocky.core.Theme chosenTheme = currentTheme.getThemeList()[which];
    soundListDisplay.setAdapter(new android.widget.ArrayAdapter<java.lang.String>(getApplicationContext(), android.R.layout.simple_spinner_item, chosenTheme.getSoundNameList()));
    currentThemeTextView.setText(("Current Theme: " + (chosenTheme.getName())));
    dialog.dismiss();
}