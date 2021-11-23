public void onSucess(java.lang.Object payload) {
    holder.progressBar.setVisibility(View.GONE);
    try {
        byte[] imageBytes = ((byte[]) (payload));
        android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
        android.util.Log.d(LOG_TAG, ("success " + payload));
        holder.image.setImageBitmap(bitmap);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}