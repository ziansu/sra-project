protected java.lang.String os() {
    java.lang.String os = java.lang.System.getProperty("os.name").toLowerCase();
    if (os.contains("win")) {
        return "windows";
    }else
        if (os.contains("mac")) {
            return "osx";
        }else {
            return "linux";
        }
    
}