public void actionPerformed(java.awt.event.ActionEvent e) {
    if (java.awt.Desktop.isDesktopSupported()) {
        try {
            java.io.File f = new java.io.File("Handbuch_DE.pdf");
            java.lang.System.out.println(f.getAbsolutePath());
            java.awt.Desktop.getDesktop().open(f);
        } catch (java.lang.Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Die Datei 'Handbuch_DE.pdf' konnte nicht gefunden werden.", "Fehler", javax.swing.JOptionPane.YES_OPTION);
        }
    }
}