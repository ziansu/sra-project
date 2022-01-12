private javax.swing.JMenu createFileMenu() {
    javax.swing.JMenu menu = new javax.swing.JMenu("File");
    menu.add(createDetectiveNotes());
    menu.add(createFileExitItem());
    return menu;
}