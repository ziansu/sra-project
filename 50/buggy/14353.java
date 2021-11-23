private com.example.caxidy.proyectojuego.Bola crearSprite(int res) {
    android.graphics.Bitmap bmp = android.graphics.BitmapFactory.decodeResource(getResources(), res);
    return new com.example.caxidy.proyectojuego.Bola(this, bmp);
}