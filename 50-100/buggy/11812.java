private void insTypeFocusLost(java.awt.event.FocusEvent evt) {
    if ((insType.getSelectedIndex()) == 0) {
        MessageBox.setForeground(java.awt.Color.red);
        MessageBox.setText("One or more field are empty");
        type = null;
        iWindow.update();
        return ;
    }
    if ((insType.getSelectedItem().toString().length()) <= 0)
        return ;
    
    type = utils.E_Types.valueOf(((java.lang.String) (insType.getSelectedItem())));
}