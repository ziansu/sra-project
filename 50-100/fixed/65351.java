@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    saveNewFile(pyramids.HtmlBodyCreator.createBody());
    java.io.File htmlFile = new java.io.File(Config.PYRAMID_HTMLFILE_PATH);
    try {
        java.awt.Desktop.getDesktop().browse(htmlFile.toURI());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}