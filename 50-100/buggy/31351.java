private void insStatusFocusLost(java.awt.event.FocusEvent evt) {
    if ((insStatus.getSelectedIndex()) == 0) {
        MessageBox.setForeground(java.awt.Color.red);
        MessageBox.setText("One or more field are empty");
        return ;
    }
    if ((insStatus.getSelectedIndex()) == 2)
        status = true;
    else
        if ((insStatus.getSelectedIndex()) == 1)
            status = false;
        
    
}