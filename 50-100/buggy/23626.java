@java.lang.Override
protected void onPostExecute(com.microsoft.adaptivecards.renderer.http.HttpRequestResult<android.graphics.Bitmap> result) {
    if (result.isSuccessful()) {
        m_imageView.setImageBitmap(result.getResult());
    }else {
        android.widget.Toast.makeText(m_context, ("Unable to load image: " + (result.getException().getMessage())), Toast.LENGTH_SHORT);
    }
}