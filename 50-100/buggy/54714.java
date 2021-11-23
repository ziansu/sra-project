public void getConfigDetails() {
    java.io.File configFile = new java.io.File(storage.StorageTest.CONFIG_FILENAME);
    try {
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(storage.StorageTest.CONFIG_FILENAME));
        this.dataFilePath = reader.readLine();
        this.avatarFilePath = reader.readLine();
        this.backgroundFilePath = reader.readLine();
        reader.close();
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}