public int countInt(java.lang.String UserInput) {
    for (int i = 0; i < (UserInput.length()); i++) {
        if (java.lang.Character.isDigit(UserInput.charAt(i))) {
            ++(digit);
        }
    }
    return digit;
}