@java.lang.Override
public void componentResized(java.awt.event.ComponentEvent e) {
    menuOptionsWindow.setSize(com.teamdev.jxmaps.demo.PopupMenu.MENU_WIDTH, controlPanel.getPreferredHeight());
    menuOptionsWindow.getContentPane().revalidate();
}