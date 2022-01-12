public java.awt.Component getListCellRendererComponent(javax.swing.JList list, java.lang.Object value, int index, boolean isSelected, boolean hasFocus) {
    if (isSelected && (value instanceof org.promasi.client_swing.components.JList.CheckBoxListEntry)) {
        org.promasi.client_swing.components.JList.CheckBoxListEntry entry = ((org.promasi.client_swing.components.JList.CheckBoxListEntry) (value));
        _checkBox.setSelected(entry.isSelected());
        _htmlPane.setText(entry.toString());
    }else {
        _htmlPane.setText(value.toString());
    }
    return _panel;
}