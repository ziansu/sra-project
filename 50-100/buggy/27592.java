private void closeMasterFrame() {
    if (book.unsaved()) {
        int value = javax.swing.JOptionPane.showConfirmDialog(this, "Das aktuelle Buch ist nicht gespeichert. wollen sie das aktuelle buch speichern?", "Frage...", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.WARNING_MESSAGE);
        if (value == (javax.swing.JOptionPane.YES_OPTION)) {
            try {
                book.save();
            } catch (java.lang.Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Das Buch konnte nicht gespeichert werden");
                e.printStackTrace(java.lang.System.out);
            }
        }
    }
}