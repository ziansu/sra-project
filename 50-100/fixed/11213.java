public static boolean openFolder(java.lang.String path) {
    java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
    java.io.File dirToOpen;
    try {
        dirToOpen = new java.io.File(path);
        desktop.open(dirToOpen);
    } catch (java.lang.Exception e) {
        Control.InvokeProgram.logger.error(org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(e));
        return false;
    }
    return true;
}