public java.awt.Component getListCellRendererComponent(javax.swing.JList list, java.lang.Object value, int index, boolean isSelected, boolean hasFocus) {
    if (value instanceof org.promasi.client_swing.components.JList.CheckBoxListEntry) {
        org.promasi.client_swing.components.JList.CheckBoxListEntry entry = ((org.promasi.client_swing.components.JList.CheckBoxListEntry) (value));
        _htmlPane.setText(entry.toString());
        _checkBox.setSelected(entry.isSelected());
    }else {
        _htmlPane.setText(value.toString());
    }
    return _panel;
}