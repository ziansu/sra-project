public java.lang.String readMetadata() throws java.io.IOException {
    LockMetadata();
    java.io.BufferedReader FileReader = new java.io.BufferedReader(new java.io.FileReader(metadataFile));
    try {
        java.lang.String data = FileReader.readLine();
        metadata = new common.HashRing(data);
        UnlockMetadata();
    } catch (java.lang.Exception e) {
        app_kvEcs.ECS.logger.warn("Could not read metadata from file");
        UnlockMetadata();
        FileReader.close();
        return null;
    }
    FileReader.close();
    return metadata.toString();
}