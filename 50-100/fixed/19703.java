public void setPhotoUri(android.net.Uri uri) {
    if (uri.equals(photoUri))
        return ;
    
    photoUri = uri;
    if ((photoBitmap) != null) {
        photoBitmap.recycle();
    }
    try {
        photoBitmap = MediaStore.Images.Media.getBitmap(org.linphone.ContactsManager.getInstance().getContentResolver(), photoUri);
    } catch (java.io.FileNotFoundException e) {
    } catch (java.io.IOException e) {
        org.linphone.mediastream.Log.e(e);
    }
}