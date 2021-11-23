@com.facebook.react.bridge.ReactMethod
public void exists(java.lang.String filePath, com.facebook.react.bridge.Promise promise) {
    try {
        java.io.File file = new java.io.File(filePath);
        promise.resolve(file.exists());
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        reject(promise, filePath, ex);
    }
}