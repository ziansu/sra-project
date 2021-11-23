javax.swing.JComboBox getApectEditorBox(int row) {
    javax.swing.JComboBox editCombo = editorMap.get(this.getValueAt(row, jmri.jmrit.beantable.signalmast.SYSNAMECOL));
    if (editCombo == null) {
        javax.swing.JComboBox<java.lang.String> editCombo = new javax.swing.JComboBox<java.lang.String>(getAspectVector(row));
        editorMap.put(this.getValueAt(row, jmri.jmrit.beantable.signalmast.SYSNAMECOL), editCombo);
    }
    return editCombo;
}