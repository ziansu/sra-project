protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == 1) && (resultCode == (RESULT_OK))) {
        android.os.Bundle extras = data.getExtras();
        imageBitMap = ((android.graphics.Bitmap) (extras.get("data")));
        pictureView.setImageBitmap(imageBitMap);
    }
}