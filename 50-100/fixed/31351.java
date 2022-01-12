private void insStatusFocusLost(java.awt.event.FocusEvent evt) {
    if ((insStatus.getSelectedIndex()) == 0) {
        return ;
    }
    if ((insStatus.getSelectedIndex()) == 2)
        status = true;
    else
        if ((insStatus.getSelectedIndex()) == 1)
            status = false;
        
    
}