private static java.lang.String getConfigLocation() {
    java.lang.String location = java.lang.System.getProperty("configdir");
    if (location == null) {
        location = "./config";
    }
    if (!(location.endsWith("/"))) {
        location += "/";
    }
    if (!(location.startsWith("file:"))) {
        location = "file:" + location;
    }
    return location + "**/*.*";
}