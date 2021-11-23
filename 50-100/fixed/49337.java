@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (com.android.michaello.horoscanner.MainActivity.REQUEST_TAKE_PHOTO)) && (resultCode == (android.app.Activity.RESULT_OK))) {
        _scanner = new com.android.michaello.horoscanner.FaceScanner(getApplicationContext());
        _lastFace = _scanner.scan(com.android.michaello.horoscanner.Utility.getBitmapFromFile(_currentPhotoPath));
        if ((_lastFace) != null) {
            displayResults();
        }else {
            displayResults();
        }
    }
}