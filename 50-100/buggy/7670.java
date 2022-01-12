void setActionNameBox(int itemType) {
    if ((_selectionMode) != (SelectionMode.USECOMBO)) {
        return ;
    }
    _comboNameBox = createNameBox(itemType);
    if ((_comboNameBox) == null) {
        return ;
    }
    java.lang.String newName = _curAction.getDeviceName();
    _comboNameBox.setSelectedBeanByName(newName);
    _comboNameBox.addItemListener(new jmri.jmrit.conditional.NameBoxListener(_actionNameField));
    _namePanel.setVisible(false);
    _actionComboNamePanel.setVisible(true);
}