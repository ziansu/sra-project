public java.lang.String getScreenshot() {
    if ((screenshot) == null) {
        return null;
    }
    if ((getBaseUrl()) == null) {
        return screenshot;
    }
    return ((((getBaseUrl()) + "/files/") + (getId())) + "/") + (screenshot);
}