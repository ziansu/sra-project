@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... URL) {
    java.lang.String imageURL = URL[0];
    android.graphics.Bitmap bitmap = null;
    try {
        java.io.InputStream input = new java.net.URL(imageURL).openStream();
        bitmap = android.graphics.BitmapFactory.decodeStream(input);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return bitmap;
}