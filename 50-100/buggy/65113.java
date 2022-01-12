@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String varName = nameField.getText();
    if (!(game.hasBinding(varName)))
        game.addVariable(varName);
    
    game.setVariable(varName, valueField.getText());
    model.fireTableStructureChanged();
}