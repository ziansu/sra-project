private java.lang.String charType(char input) {
    java.lang.String output = java.lang.Character.toString(input);
    if (java.lang.Character.isAlphabetic(input)) {
        output = "z";
    }else
        if (java.lang.Character.isDigit(input)) {
            output = "1";
        }
    
    return output;
}