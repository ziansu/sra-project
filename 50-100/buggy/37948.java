@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... URL) {
    java.lang.String imageURL = URL[0];
    try {
        java.io.InputStream input = new java.net.URL(imageURL).openStream();
        profileBitmap = android.graphics.BitmapFactory.decodeStream(input);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return profileBitmap;
}