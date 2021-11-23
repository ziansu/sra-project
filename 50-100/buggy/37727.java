public void onClick(android.view.View v) {
    if (com.keepassdroid.compat.StorageAF.useStorageFramework(this)) {
        android.content.Intent i = new android.content.Intent(com.keepassdroid.compat.StorageAF.ACTION_OPEN_DOCUMENT);
        i.addCategory(Intent.CATEGORY_OPENABLE);
        i.setType("*/*");
        startActivityForResult(i, com.keepassdroid.fileselect.FileSelectActivity.OPEN_DOC);
    }else {
        android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
        i.addCategory(Intent.CATEGORY_OPENABLE);
        i.setType("*/*");
        try {
            startActivityForResult(i, com.keepassdroid.fileselect.FileSelectActivity.GET_CONTENT);
        } catch (android.content.ActivityNotFoundException e) {
            lookForOpenIntentsFilePicker();
        } catch (java.lang.SecurityException e) {
            lookForOpenIntentsFilePicker();
        }
    }
}