public boolean checkGuess(java.lang.String input) {
    if (!(isNumeric(input)))
        return false;
    else
        if ((((java.lang.Integer.parseInt(input)) == 0) || ((java.lang.Integer.parseInt(input)) > 20)) || ((java.lang.Integer.parseInt(input)) < 5))
            return false;
        else
            return true;
        
    
}