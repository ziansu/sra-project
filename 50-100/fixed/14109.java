@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (com.example.chwtlk.myquizapplication.CameraActivity.REQUEST_IMAGE_CAPTURE)) && (resultCode == (RESULT_OK))) {
        if (data != null) {
            android.os.Bundle extras = data.getExtras();
            if (extras != null) {
                android.graphics.Bitmap imageBitmap = ((android.graphics.Bitmap) (extras.get("data")));
                mImageView = ((android.widget.ImageView) (findViewById(R.id.mImageView)));
                mImageView.setImageBitmap(imageBitmap);
            }
        }
    }
}