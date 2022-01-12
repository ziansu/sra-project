public static java.lang.String getExternalPath(android.content.Context context, java.io.File file) {
    java.io.File externalDir = context.getExternalFilesDir("Sound");
    if (externalDir == null) {
        android.widget.Toast.makeText(context, context.getString(R.string.error_no_external_storage), Toast.LENGTH_LONG).show();
        return null;
    }
    return (externalDir + (java.io.File.separator)) + (file.getName());
}