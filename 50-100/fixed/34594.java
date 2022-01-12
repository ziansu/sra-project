private boolean checkSandbox(java.lang.String resource) {
    if ((resource.contains("..")) || (resource.startsWith("/"))) {
        Redux.instance.getLogger().warn("Critical security error! Tried to access file(s) outside of the Redux config folder with the path of: %s\nWill deny requested file.", resource);
        return false;
    }
    return true;
}