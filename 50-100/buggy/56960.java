public java.lang.String readMetadata() {
    LockMetadata();
    try {
        java.io.BufferedReader FileReader = new java.io.BufferedReader(new java.io.FileReader(metadataFile));
        java.lang.String data = FileReader.readLine();
        metadata = new common.HashRing(data);
        FileReader.close();
        UnlockMetadata();
        return metadata.toString();
    } catch (java.lang.Exception e) {
        app_kvEcs.ECS.logger.warn("Could not read metadata from file");
        UnlockMetadata();
        return null;
    }
}