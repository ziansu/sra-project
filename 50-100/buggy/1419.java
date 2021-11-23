private void updateAnzahlColor(java.lang.Integer vpe) {
    if (vpe <= 0) {
        anzahlField.setForeground(java.awt.Color.black);
    }else {
        java.lang.Integer stueck = ((java.lang.Integer) (anzahlSpinner.getValue()));
        if (stueck < vpe) {
            anzahlField.setForeground(java.awt.Color.red);
        }else {
            anzahlField.setForeground(java.awt.Color.green.darker().darker());
        }
    }
}