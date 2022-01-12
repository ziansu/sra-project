public java.lang.String getScreenshot() {
    if (((screenshot) == null) || (screenshot.isEmpty())) {
        return null;
    }
    if ((getBaseUrl()) == null) {
        return screenshot;
    }
    return ((((getBaseUrl()) + "/files/") + (getId())) + "/") + (screenshot);
}