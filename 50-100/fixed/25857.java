public static com.swiftrunner.raincloud.serialization.RCDatabase DeserializeFromFile(java.lang.String path) {
    byte[] buffer = null;
    try {
        java.io.BufferedInputStream stream = new java.io.BufferedInputStream(new java.io.FileInputStream(path));
        buffer = new byte[stream.available()];
        stream.read(buffer);
        stream.close();
    } catch (java.lang.Exception e) {
        return null;
    }
    return com.swiftrunner.raincloud.serialization.RCDatabase.Deserialize(buffer);
}