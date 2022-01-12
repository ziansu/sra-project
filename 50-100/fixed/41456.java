@android.support.annotation.RequiresApi(api = Build.VERSION_CODES.KITKAT)
public java.lang.String sendFileRequest(java.lang.String urlString, android.content.Context context) throws java.io.IOException {
    final java.io.File uploadFile = new java.io.File(((context.getFilesDir().getAbsoluteFile()) + "/create_attendance.xml"));
    my.dumc.dumc.MultipartUtility multipartUtility = new my.dumc.dumc.MultipartUtility(urlString);
    multipartUtility.addFilePart("create_attendance", uploadFile);
    byte[] bytes = multipartUtility.finish();
    java.lang.String result = new java.lang.String(bytes, java.nio.charset.StandardCharsets.UTF_8);
    return result;
}