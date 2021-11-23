void setActionNameBox(int itemType) {
    if ((_selectionMode) != (SelectionMode.USECOMBO)) {
        return ;
    }
    _comboNameBox = createNameBox(itemType);
    if ((_comboNameBox) == null) {
        return ;
    }
    _comboNameBox.setSelectedBeanByName(_curAction.getDeviceName());
    _comboNameBox.addItemListener(new jmri.jmrit.conditional.NameBoxListener(_actionNameField));
    _actionComboNamePanel.remove(1);
    _actionComboNamePanel.add(_comboNameBox, null, 1);
    _namePanel.setVisible(false);
    _actionComboNamePanel.setVisible(true);
}