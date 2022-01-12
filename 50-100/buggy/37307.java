public java.lang.String getAppDataFolder() {
    switch (this) {
        case OSX :
            return (java.lang.System.getProperty("user.home")) + "/Library/Application Support";
        case WINDOWS :
            return java.lang.System.getenv("APPDATA");
        case LINUX :
        case UNKNOWN :
            return java.lang.System.getProperty("user.home");
    }
    return java.lang.System.getProperty("user.home");
}