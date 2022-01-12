@com.facebook.react.bridge.ReactMethod
public void exists(java.lang.String filepath, com.facebook.react.bridge.Promise promise) {
    try {
        java.io.File file = new java.io.File(filepath);
        promise.resolve(file.exists());
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        reject(promise, filepath, ex);
    }
}