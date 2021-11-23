@com.facebook.react.bridge.ReactMethod
public void unlink(java.lang.String filepath, com.facebook.react.bridge.Promise promise) {
    try {
        java.io.File file = new java.io.File(filepath);
        if (!(file.exists()))
            throw new java.lang.Exception("File does not exist");
        
        DeleteRecursive(file);
        promise.resolve(null);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        reject(promise, filepath, ex);
    }
}