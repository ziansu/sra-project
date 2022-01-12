public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JRadioButtonMenuItem src = ((javax.swing.JRadioButtonMenuItem) (e.getSource()));
    probe = src.isSelected();
    if (probe) {
        activateRubberBand();
        setCursor(java.awt.Cursor.getPredefinedCursor(java.awt.Cursor.CROSSHAIR_CURSOR));
    }else {
        deactivateRubberBand();
        setCursor(java.awt.Cursor.getDefaultCursor());
    }
}