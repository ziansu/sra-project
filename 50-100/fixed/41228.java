void setVariableNameBox(int itemType) {
    if ((_selectionMode) != (SelectionMode.USECOMBO)) {
        return ;
    }
    _comboNameBox = createNameBox(itemType);
    if ((_comboNameBox) == null) {
        return ;
    }
    _comboNameBox.addItemListener(new jmri.jmrit.conditional.NameBoxListener(_variableNameField));
    _comboNameBox.setSelectedBeanByName(_curVariable.getName());
    _variableComboNamePanel.remove(1);
    _variableComboNamePanel.add(_comboNameBox, null, 1);
    _variableNamePanel.setVisible(false);
    _variableComboNamePanel.setVisible(true);
}