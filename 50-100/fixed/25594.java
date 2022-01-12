@com.facebook.react.bridge.ReactMethod
public void mkdir(java.lang.String filePath, com.facebook.react.bridge.Promise promise) {
    try {
        java.io.File file = new java.io.File(filePath);
        file.mkdirs();
        boolean exists = file.exists();
        if (!exists)
            throw new java.lang.Exception("Directory could not be created");
        
        promise.resolve(null);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        reject(promise, filePath, ex);
    }
}