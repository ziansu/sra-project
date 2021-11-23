@java.lang.Override
public void render() {
    super.render();
    pack();
    java.awt.Dimension screenSize = getToolkit().getScreenSize();
    setLocation(0, (((int) ((screenSize.getHeight()) / 2)) - ((getHeight()) / 2)));
}