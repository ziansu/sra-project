public void openFile(java.lang.String name) {
    java.io.File file = new java.io.File(name);
    android.content.Intent target = new android.content.Intent(android.content.Intent.ACTION_VIEW);
    target.setDataAndType(android.net.Uri.fromFile(file), "application/pdf");
    target.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
    android.content.Intent intent = android.content.Intent.createChooser(target, "Open File");
    try {
        mContext.startActivity(intent);
    } catch (android.content.ActivityNotFoundException e) {
        android.widget.Toast.makeText(mContext, "No app to read PDF File", Toast.LENGTH_LONG).show();
    }
}