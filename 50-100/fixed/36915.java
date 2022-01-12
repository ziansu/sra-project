public void ButtonClick(java.awt.event.ActionEvent aE) {
    java.lang.String lEingabe = aE.getActionCommand();
    if ("+-".equals(lEingabe))
        lEingabe = "-";
    
    if ((("sin".equals(lEingabe)) || ("cos".equals(lEingabe))) || ("tan".equals(lEingabe)))
        lEingabe = lEingabe + "(";
    
    tfInput.setText(((tfInput.getText()) + lEingabe));
}