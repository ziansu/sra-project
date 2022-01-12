public void onClick(android.content.DialogInterface dialog, int whichButton) {
    java.lang.String name = "/" + (newDirectoryNameInput.getText().toString());
    java.io.File folder = new java.io.File(((currentDirectory.getAbsolutePath()) + name));
    if (!(folder.exists())) {
        folder.mkdir();
    }
    showDirectoryLayout(currentDirectory);
}