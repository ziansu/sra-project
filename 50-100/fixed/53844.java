public javax.swing.JComboBox getAppearanceEditorBox(int row) {
    javax.swing.JComboBox editCombo = editorMap.get(this.getValueAt(row, jmri.jmrit.beantable.SYSNAMECOL));
    if (editCombo == null) {
        javax.swing.JComboBox<java.lang.String> editCombo = new javax.swing.JComboBox<java.lang.String>(getRowVector(row));
        editorMap.put(this.getValueAt(row, jmri.jmrit.beantable.SYSNAMECOL), editCombo);
    }
    return editCombo;
}