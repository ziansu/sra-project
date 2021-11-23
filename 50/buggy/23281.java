public java.lang.String getVersion() {
    if ((version) == null) {
        version = ((((getMajorVersion()) + ".") + (getMinorVersion())) + ".") + (getPatchVersion());
    }
    return version;
}