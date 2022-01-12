private java.lang.String processPhoto(java.lang.String path) throws java.io.IOException {
    android.graphics.Bitmap bitmap = correctRotation(path);
    com.googlecode.tesseract.android.TessBaseAPI baseApi = new com.googlecode.tesseract.android.TessBaseAPI();
    baseApi.clear();
    baseApi.setDebug(true);
    baseApi.init(Constants.TESSERACT_FOLDER, Constants.TESSERACT_LANGUAGE, TessBaseAPI.OEM_DEFAULT);
    baseApi.setImage(bitmap);
    java.lang.String recognizedText = baseApi.getUTF8Text();
    baseApi.end();
    return recognizedText;
}