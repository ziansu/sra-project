private javax.swing.JMenu getTestMenu() {
    if ((testMenu) == null) {
        testMenu = new javax.swing.JMenu();
        testMenu.setText("Test");
        testMenu.add(getCitySearchMenuItem());
    }
    return testMenu;
}