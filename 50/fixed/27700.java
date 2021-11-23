private javax.swing.JMenu initHelpMenu() {
    javax.swing.JMenu helpMenu = new javax.swing.JMenu("Help");
    javax.swing.JMenuItem aboutItem = new javax.swing.JMenuItem("About...");
    helpMenu.add(aboutItem);
    aboutItem.addActionListener(new diplom.mainWindow.MainFrame.AboutItemListener());
    return helpMenu;
}