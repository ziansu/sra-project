@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    java.lang.String path = utils.chooseDialog(false, frame, utils.getDesktopPath(), "");
    if ((path != null) && (!(path.equals("")))) {
        ConfigManager.instance.set(ConfigManager.PATH, path);
    }
}