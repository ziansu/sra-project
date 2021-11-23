public void write() throws java.io.IOException {
    read.close();
    configFile.delete();
    configFile.createNewFile();
    java.io.Writer fw = new java.io.FileWriter(configFile);
    fw.write(((((lastFile) + "\n") + (defaultTheme)) + "\n"));
}