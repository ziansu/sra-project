public void onClick(android.view.View v) {
    android.content.Intent i;
    if (com.keepassdroid.compat.StorageAF.useStorageFramework(this)) {
        i = new android.content.Intent(com.keepassdroid.compat.StorageAF.ACTION_OPEN_DOCUMENT);
        i.addCategory(Intent.CATEGORY_OPENABLE);
        i.setType("*/*");
        startActivityForResult(i, com.keepassdroid.fileselect.FileSelectActivity.OPEN_DOC);
    }else {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
            i = new android.content.Intent(android.content.Intent.ACTION_OPEN_DOCUMENT);
        }else {
            i = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
        }
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