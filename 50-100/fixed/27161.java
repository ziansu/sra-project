private void setMainFrameTitle() {
    java.lang.String titleText = "JoveNotes Maker - ";
    if ((this.projectConfigFile) == null) {
        titleText += "[]";
    }else {
        titleText += ("[" + (projectConfigFile.getAbsolutePath())) + "]";
    }
    getMainFrame().setTitle(titleText);
}