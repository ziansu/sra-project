@java.lang.Override
public void createLayer() {
    java.lang.String name = javax.swing.JOptionPane.showInputDialog(this, "Map name", "New map");
    worldPanel.pushPosition(new mudmap2.backend.WorldCoordinate(getWorld().getNewLayer(name).getId(), 0, 0));
    repaint();
}