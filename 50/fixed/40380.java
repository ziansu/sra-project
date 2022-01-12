public void setImg(byte[] img) {
    this.img = img;
    if (img == null)
        bmp = null;
    else
        bmp = android.graphics.BitmapFactory.decodeByteArray(img, 0, img.length);
    
}