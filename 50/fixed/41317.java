private void showFileChooser() {
    android.content.Intent intent = new android.content.Intent(this, com.nbsp.materialfilepicker.ui.FilePickerActivity.class);
    startActivityForResult(intent, 1);
}