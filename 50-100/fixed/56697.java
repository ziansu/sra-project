private javax.swing.JMenu iniRegistrationMenu() {
    javax.swing.JMenu registrationMenu = new javax.swing.JMenu("Регистрация");
    javax.swing.JMenuItem cashDocumentsRegistration = new javax.swing.JMenuItem("Регистрация кассовых документов");
    registrationMenu.add(cashDocumentsRegistration);
    javax.swing.JMenuItem memOrderRegistration = new javax.swing.JMenuItem("Регистрация мемориального ордера");
    registrationMenu.add(memOrderRegistration);
    javax.swing.JMenuItem PlatDocRegistration = new javax.swing.JMenuItem("Регистрация платежного документа");
    PlatDocRegistration.addActionListener(new diplom.mainWindow.MainFrame.PlatDocRegListener());
    registrationMenu.add(PlatDocRegistration);
    return registrationMenu;
}