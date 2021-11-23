public void onClick(android.view.View v) {
    message("Save", false);
    android.content.Context context = getApplicationContext();
    if (isExternalStorageWritable()) {
        writeToSDFile();
        android.widget.Toast start_toast = android.widget.Toast.makeText(context, "Saving", Toast.LENGTH_SHORT);
        start_toast.show();
    }else {
        android.widget.Toast start_toast = android.widget.Toast.makeText(context, "No SD card present!", Toast.LENGTH_SHORT);
        start_toast.show();
    }
}