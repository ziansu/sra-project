@java.lang.Override
public void onResponse(retrofit2.Response<com.paine.nativeApp.response.UploadResponse> response) {
    android.util.Log.i(com.paine.nativeApp.PreviewActivity.LOG_TAG, ("Code is: " + (response.code())));
    retrofit_upload = true;
    if ((http_upload) == true) {
        progressBar.setVisibility(View.INVISIBLE);
        android.content.Intent i = new android.content.Intent(getApplicationContext(), com.paine.nativeApp.MainActivity.class);
        startActivity(i);
    }
}