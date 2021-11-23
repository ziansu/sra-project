protected void comboBoxUpdated(javax.swing.JComboBox<java.lang.Object> comboBox, java.lang.String name) {
    fields.put(name, comboBox.getSelectedItem());
    java.lang.System.out.println(("updated combobox: " + name));
}