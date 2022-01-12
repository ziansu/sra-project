private boolean isInputValid() {
    if (mailBox.getText().isEmpty()) {
        return false;
    }else
        if (passwordBox.getText().isEmpty()) {
            return false;
        }else
            if ("".equals(roles.getText())) {
                return false;
            }
        
    
    return true;
}