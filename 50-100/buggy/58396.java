private static java.lang.String getVersionAfter(java.lang.String version, boolean finalized) {
    int dotIndex = version.indexOf(".");
    java.lang.Integer major = java.lang.Integer.valueOf(version.substring(0, dotIndex));
    java.lang.Integer minor = java.lang.Integer.valueOf(version.substring((dotIndex + 1)));
    if (finalized) {
        major++;
        minor = 0;
    }else {
        minor++;
    }
    return (major + ".") + minor;
}