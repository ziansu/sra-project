public void removeStyleSheetFile() {
    java.lang.String path = com.stratelia.webactiv.util.FileRepositoryManager.getAbsolutePath(this.getComponentId());
    java.io.File styles = new java.io.File(((path + (java.io.File.separator)) + "styles.css"));
    if ((styles != null) && (styles.exists())) {
        styles.delete();
    }
    this.styleSheet = null;
}