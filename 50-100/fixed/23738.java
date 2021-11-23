@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_GET_CONTENT);
    android.net.Uri uri = android.net.Uri.parse(android.os.Environment.getExternalStorageState());
    intent.setDataAndType(uri, "text/csv");
    startActivity(android.content.Intent.createChooser(intent, "Open folder"));
}