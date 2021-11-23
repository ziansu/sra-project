public void load() {
    java.io.File resourceFile = new java.io.File(getClass().getClassLoader().getResource(org.jpc.examples.metro.MetroRawDataLoader.DEFAULT_DATA_FILE).getFile());
    load(resourceFile);
}