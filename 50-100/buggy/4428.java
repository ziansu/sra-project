@java.lang.Override
public void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException {
    if (c == null)
        return ;
    
    okhttp3.ResponseBody in = response.body();
    java.io.InputStream inputStream = in.byteStream();
    java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream);
    final android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeStream(bufferedInputStream);
    rehanced.com.simpleetherwallet.utils.TokenIconCache.getInstance(c).put(c, tokenNamef, new android.graphics.drawable.BitmapDrawable(c.getResources(), bitmap).getBitmap());
    if (lastToken)
        callback.onLastIconDownloaded();
    
}