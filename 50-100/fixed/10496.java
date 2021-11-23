@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent windowEvent) {
    if ((javax.swing.JOptionPane.showConfirmDialog(null, "Wollen sie Speicher und Schließen?", "Wirklich schließen?", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE)) == (javax.swing.JOptionPane.YES_OPTION)) {
        if (save()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Der Zustand wurde gespeichert.", "Speichern", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            java.lang.System.exit(0);
        }else {
            javax.swing.JOptionPane.showMessageDialog(null, "Fehler beim Speichern", "Speichern", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }else {
        java.lang.System.exit(0);
    }
}