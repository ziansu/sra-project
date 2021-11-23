@com.facebook.react.bridge.ReactMethod
public void mkdir(java.lang.String filepath, com.facebook.react.bridge.ReadableMap options, com.facebook.react.bridge.Promise promise) {
    try {
        java.io.File file = new java.io.File(filepath);
        file.mkdirs();
        boolean exists = file.exists();
        if (!exists)
            throw new java.lang.Exception("Directory could not be created");
        
        promise.resolve(null);
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        reject(promise, filepath, ex);
    }
}