protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        android.content.Intent i;
        switch (requestCode) {
            case com.example.arjun.nhacks.GroupHardActivity.CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE :
                android.net.Uri uri = fileUri;
                break;
        }
    }
    android.content.Intent inte = new android.content.Intent(this, com.example.arjun.nhacks.ScanResults.class);
    startActivity(inte);
}