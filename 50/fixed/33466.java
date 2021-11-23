public boolean isAlias(java.lang.String input) {
    for (int i = 0; i < (alias.length); i++)
        if (input.equals(alias[i]))
            return true;
        
    
    return false;
}