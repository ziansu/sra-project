protected void onPostExecute(java.lang.Long result) {
    if (result == 0) {
        android.widget.Toast.makeText(getApplicationContext(), R.string.async_upload_done, Toast.LENGTH_SHORT).show();
        android.util.Log.i("UploadPolyObjectTask", "done");
    }else {
        android.widget.Toast.makeText(getApplicationContext(), R.string.async_upload_error, Toast.LENGTH_SHORT).show();
    }
}