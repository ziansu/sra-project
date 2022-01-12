@java.lang.Override
public void onClick(android.view.View v) {
    if (CheckPermissions()) {
        java.lang.String timeStamp = new java.text.SimpleDateFormat("yyyyMMdd-HHmmss", java.util.Locale.ITALIAN).format(new java.util.Date());
        android.util.Log.v(TAG, timeStamp);
        fileNameOriginal = (((android.os.Environment.getExternalStorageDirectory()) + "/PicturesTest/") + timeStamp) + "-original.jpg";
        openImageIntent();
    }else {
        android.widget.Toast.makeText(getContext(), "This app doesn't have permission to do what it has to do.", Toast.LENGTH_LONG).show();
    }
}