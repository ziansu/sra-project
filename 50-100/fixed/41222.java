public boolean equals(java.lang.StringBuffer givenPassword, java.lang.StringBuffer password2) {
    if ((givenPassword.length()) != (password.length()))
        return false;
    
    for (int i = 0; i < (password2.length()); i++) {
        char c1 = password2.charAt(i);
        char c2 = givenPassword.charAt(i);
        if (c1 != c2)
            return false;
        
    }
    return true;
}