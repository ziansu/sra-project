public void ButtonClick(java.awt.event.ActionEvent aE) {
    java.lang.String lEingabe = aE.getActionCommand();
    if (lEingabe == "+-")
        lEingabe = "-";
    
    if (((lEingabe == "sin") || (lEingabe == "cos")) || (lEingabe == "tan"))
        lEingabe = lEingabe + "(";
    
    tfInput.setText(((tfInput.getText()) + lEingabe));
}