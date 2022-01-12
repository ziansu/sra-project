void setVariableNameBox(int itemType) {
    if ((_selectionMode) != (SelectionMode.USECOMBO)) {
        return ;
    }
    _comboNameBox = createNameBox(itemType);
    if ((_comboNameBox) == null) {
        return ;
    }
    java.lang.String newName = _curVariable.getName();
    _comboNameBox.setSelectedBeanByName(newName);
    _comboNameBox.addItemListener(new jmri.jmrit.conditional.NameBoxListener(_variableNameField));
    _variableNamePanel.setVisible(false);
    _variableComboNamePanel.setVisible(true);
}