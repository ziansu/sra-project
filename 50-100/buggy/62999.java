@com.facebook.react.bridge.ReactMethod
public void copyFile(java.lang.String filepath, java.lang.String destPath, com.facebook.react.bridge.Promise promise) {
    try {
        copyFile(filepath, destPath);
        promise.resolve(null);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        reject(promise, filepath, ex);
    }
}