public void removeStyleSheetFile() {
    java.lang.String path = org.silverpeas.util.FileRepositoryManager.getAbsolutePath(this.getComponentId());
    java.io.File styles = new java.io.File(((path + (java.io.File.separator)) + "styles.css"));
    if (styles.exists()) {
        styles.delete();
    }
    this.styleSheet = null;
}