@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == (com.example.jimmyklein.geosnap.MainActivity.CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE)) {
        if (resultCode == (RESULT_OK)) {
            displayImage();
        }else
            if (resultCode == (RESULT_CANCELED)) {
            }else {
            }
        
    }
}