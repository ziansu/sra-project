private net.kikkirej.protocolagent.options.Value initCategoryField() {
    java.lang.String categoryLabel = propertyManager.get(PropertyKeys.CATEGORYLABEL);
    javax.swing.JLabel label = new javax.swing.JLabel((categoryLabel + "*:"));
    javax.swing.JComboBox<java.lang.String> comboBox = new javax.swing.JComboBox<>();
    fillComboBox(comboBox);
    net.kikkirej.protocolagent.options.Value value = new net.kikkirej.protocolagent.options.Value("", categoryLabel);
    value.setNeededValue(true);
    comboBox.addActionListener(new net.kikkirej.protocolagent.options.screen.listener.CategoryChangedListener(comboBox, value));
    frame.add(label);
    frame.add(comboBox);
    return value;
}