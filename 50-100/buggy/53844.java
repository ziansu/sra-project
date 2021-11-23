public javax.swing.JComboBox getAppearanceEditorBox(int row) {
    javax.swing.JComboBox editCombo = editorMap.get(this.getValueAt(row, jmri.jmrit.beantable.SYSNAMECOL));
    if (editCombo == null) {
        editCombo = new javax.swing.JComboBox(getRowVector(row));
        editorMap.put(this.getValueAt(row, jmri.jmrit.beantable.SYSNAMECOL), editCombo);
    }
    return editCombo;
}