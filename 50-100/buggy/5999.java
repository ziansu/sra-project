@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    this.parent.screen.addOption(nameField.getText(), this.parent.screen.getParent().getScreen(((java.lang.String) (screenField.getSelectedItem()))));
    model.fireTableStructureChanged();
}