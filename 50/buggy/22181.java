public boolean Validate() {
    boolean result = true;
    if ((FirstName.matches("")) || (LastName.matches("")))
        return false;
    else
        return true;
    
}