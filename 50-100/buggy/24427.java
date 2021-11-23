@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(mInstance, com.sdlpal.sdlpal.FilePickerActivity.class);
    i.putExtra(FilePickerActivity.EXTRA_ALLOW_MULTIPLE, false);
    i.putExtra(FilePickerActivity.EXTRA_ALLOW_CREATE_DIR, true);
    i.putExtra(FilePickerActivity.EXTRA_MODE, FilePickerActivity.MODE_DIR);
    i.putExtra(FilePickerActivity.EXTRA_START_PATH, ((android.widget.EditText) (findViewById(R.id.edFolder))).getText());
    startActivityForResult(i, com.sdlpal.sdlpal.SettingsActivity.BROWSE_GAMEDIR_CODE);
}