private javax.swing.JMenu createFileMenu() {
    javax.swing.JMenu menu = new javax.swing.JMenu("File");
    menu.add(createFileExitItem());
    menu.add(createDetectiveNotes());
    return menu;
}