public void make_qr() {
    android.graphics.Bitmap b = null;
    qr_code_image.setImageBitmap(b);
    try {
        b = encodeAsBitmap(com.hsv.varun.unico.MyService.code);
    } catch (com.google.zxing.WriterException e) {
        e.printStackTrace();
    }
    qr_code_image.setImageBitmap(b);
    qr_code.setText((("Code: " + (com.hsv.varun.unico.MyService.code)) + ""));
}