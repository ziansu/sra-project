public void setFilename(java.lang.String arg, int type) {
    filename = arg;
    mainWindowTitle = de.x28hd.tool.Utilities.getShortname(filename);
    if ((mainWindow) != null)
        mainWindow.repaint();
    
}