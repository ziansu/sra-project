@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.example.maryjean.wildcatbank.deposits.CAM_REQUEST)) {
        android.graphics.Bitmap thumbnail = ((android.graphics.Bitmap) (data.getExtras().get("data")));
        imgTakenPhoto.setImageBitmap(thumbnail);
    }
}