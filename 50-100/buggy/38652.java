private void parse(java.nio.file.Path configFile) {
    try {
        configDigester.push(this);
        configDigester.parse(configFile.toFile());
        configDigester.pop();
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(("ERROR PARSING CONFIGURATION FILE: " + (configFile.toAbsolutePath())));
        e.printStackTrace();
    }
}