@com.facebook.react.bridge.ReactMethod
public void unlink(java.lang.String filePath, com.facebook.react.bridge.Promise promise) {
    try {
        java.io.File file = new java.io.File(filePath);
        if (!(file.exists()))
            throw new java.lang.Exception("File does not exist");
        
        DeleteRecursive(file);
        promise.resolve(null);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        reject(promise, filePath, ex);
    }
}