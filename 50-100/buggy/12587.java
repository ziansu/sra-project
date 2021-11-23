public void dibujar(android.graphics.Bitmap foto) {
    android.widget.LinearLayout group = ((android.widget.LinearLayout) (findViewById(R.id.emblematicos_text)));
    android.graphics.Bitmap scaled;
    scaled = android.graphics.Bitmap.createScaledBitmap(foto, 500, 300, false);
    android.widget.ImageView imageView = new android.widget.ImageView(this);
    imageView.setImageBitmap(scaled);
    group.addView(imageView);
}