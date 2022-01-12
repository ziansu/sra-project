@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    super.onPageFinished(view, url);
    android.util.Log.d(TAG, "onPageFinished");
    new android.os.AsyncTask<android.webkit.WebView, android.graphics.Bitmap, android.graphics.Bitmap>() {
        @java.lang.Override
        protected android.graphics.Bitmap doInBackground(android.webkit.WebView... params) {
            return getWebViewBitmap(params[0]);
        }

        @java.lang.Override
        protected void onPostExecute(android.graphics.Bitmap bitmap) {
            super.onPostExecute(bitmap);
            saveBitmap(bitmap);
        }
    }.execute(mWebView);
}