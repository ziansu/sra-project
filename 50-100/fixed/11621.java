private javax.swing.JMenu initImportMenu() {
    javax.swing.JMenu importMenu = new javax.swing.JMenu("Импорт/Экспорт");
    javax.swing.JMenuItem importMenuItem = new javax.swing.JMenuItem("Импорт/Экспорт данных");
    importMenu.add(importMenuItem);
    importMenuItem.addActionListener(( ae) -> new diplom.importexport.ImportExportSwingFrame("импорт/кспорт данных"));
    return importMenu;
}