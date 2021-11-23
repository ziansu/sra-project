@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    try {
        java.lang.String path = utils.chooseDialog(false, frame, utils.getDesktopPath(), "");
        if ((path != null) && (!(path.equals("")))) {
            toggleDragArea((!(isDragOn)));
            ConfigManager.instance.set(ConfigManager.PATH, path);
        }
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}