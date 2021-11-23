private boolean checkPassword(com.google.common.hash.HashCode password) {
    if ((setPass.getText().toString().length()) < 4)
        return false;
    else
        return true;
    
}