public android.graphics.Bitmap getImage() {
    byte[] imageAsByte = android.util.Base64.decode(image, Base64.DEFAULT);
    return android.graphics.BitmapFactory.decodeByteArray(imageAsByte, 0, imageAsByte.length);
}