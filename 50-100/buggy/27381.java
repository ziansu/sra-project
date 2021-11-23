@com.facebook.react.bridge.ReactMethod
public void writeFile(java.lang.String filepath, java.lang.String base64Content, com.facebook.react.bridge.Promise promise) {
    try {
        byte[] bytes = android.util.Base64.decode(base64Content, Base64.DEFAULT);
        java.io.FileOutputStream outputStream = new java.io.FileOutputStream(filepath, false);
        outputStream.write(bytes);
        outputStream.close();
        promise.resolve(null);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        reject(promise, filepath, ex);
    }
}