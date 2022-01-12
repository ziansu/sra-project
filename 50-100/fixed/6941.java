protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (CAMERA_PIC_REQUEST)) {
        if (data != null) {
            android.graphics.Bitmap image = ((android.graphics.Bitmap) (data.getExtras().get("data")));
            android.widget.ImageView imageview = ((android.widget.ImageView) (findViewById(R.id.imglogo)));
            imageview.setImageBitmap(image);
            new com.example.audi.uaspenir.Main.PostTask().execute(imageToString(image), "test");
            buatsnackbar("Uploading image . . .");
        }
    }
}