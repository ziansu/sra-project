private java.util.ArrayList<com.application.dsmsocial.ImageItem> getData() {
    final java.util.ArrayList<com.application.dsmsocial.ImageItem> imageItems = new java.util.ArrayList<>();
    android.content.res.TypedArray imgs = getResources().obtainTypedArray(R.array.shopImage);
    for (int i = 0; i < (imgs.length()); i++) {
        android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, (-1)));
    }
    return imageItems;
}