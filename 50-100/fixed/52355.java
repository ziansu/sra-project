protected java.lang.String getTitleColumnStyle(com.constellio.app.ui.entities.RecordVO recordVO) {
    java.lang.String style;
    if (recordVO != null) {
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
    }else {
        style = null;
    }
    return style;
}