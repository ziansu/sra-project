public android.graphics.Bitmap getBitmapFromURL(java.lang.String strURL) {
    try {
        java.net.URL url = new java.net.URL(strURL);
        java.net.HttpURLConnection connection = ((java.net.HttpURLConnection) (url.openConnection()));
        connection.setDoInput(true);
        connection.connect();
        java.io.InputStream input = connection.getInputStream();
        return android.graphics.BitmapFactory.decodeStream(input);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return null;
    }
}