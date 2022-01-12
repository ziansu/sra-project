@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... params) {
    android.graphics.Bitmap moviePoster = null;
    try {
        java.io.InputStream in = new java.net.URL(params[0]).openStream();
        moviePoster = android.graphics.BitmapFactory.decodeStream(in);
    } catch (java.lang.Exception e) {
        android.util.Log.d("Error", params[0]);
        e.printStackTrace();
    }
    return moviePoster;
}