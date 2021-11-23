private javax.swing.JMenu initAdministationMenu() {
    javax.swing.JMenu administrationMenu = new javax.swing.JMenu("Управление");
    javax.swing.JMenuItem settingsItem = new javax.swing.JMenuItem("Настройки");
    administrationMenu.add(settingsItem);
    settingsItem.addActionListener(( ae) -> new diplom.administration.SettingsFrame("Настройки"));
    return administrationMenu;
}