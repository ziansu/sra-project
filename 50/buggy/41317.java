private void showFileChooser() {
    android.content.Intent intent = new android.content.Intent(this, com.nbsp.materialfilepicker.ui.FilePickerActivity.class);
    intent.putExtra(FilePickerActivity.ARG_FILTER, java.util.regex.Pattern.compile(".*\\.txt$"));
    startActivityForResult(intent, 1);
}