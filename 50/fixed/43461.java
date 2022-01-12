public void updateImage(android.graphics.Bitmap image) {
    if ((getView()) != null)
        ((android.widget.ImageView) (getView().findViewById(R.id.image))).setImageBitmap(image);
    
}