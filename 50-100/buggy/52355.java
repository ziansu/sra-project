protected java.lang.String getTitleColumnStyle(com.constellio.app.ui.entities.RecordVO recordVO) {
    java.lang.String style;
    try {
        java.lang.String extension = com.constellio.app.ui.util.FileIconUtils.getExtension(recordVO);
        if ((extension != null) && (!(isDecomList(recordVO)))) {
            style = "file-icon-" + extension;
        }else {
            style = null;
        }
    } catch (java.lang.Exception e) {
        style = null;
    }
    return style;
}