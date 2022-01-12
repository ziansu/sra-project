private void retrieveContactPhoto() {
    android.graphics.Bitmap photo = null;
    try {
        java.io.InputStream inputStream = ContactsContract.Contacts.openContactPhotoInputStream(getContentResolver(), android.content.ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, new java.lang.Long(contactID)));
        if (inputStream != null) {
            photo = android.graphics.BitmapFactory.decodeStream(inputStream);
            contactImage.setImageBitmap(photo);
        }
        assert inputStream != null;
        inputStream.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}