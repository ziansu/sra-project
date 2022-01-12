@com.facebook.react.bridge.ReactMethod
public void copyFile(java.lang.String filePath, java.lang.String destPath, com.facebook.react.bridge.Promise promise) {
    try {
        copyFile(filePath, destPath);
        promise.resolve(null);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        reject(promise, filePath, ex);
    }
}