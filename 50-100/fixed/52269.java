public int countInt(java.lang.String UserInput) {
    for (int i = 0; i < (UserInput.length()); i++) {
        digit = 0;
        if (java.lang.Character.isDigit(UserInput.charAt(i))) {
            ++(digit);
        }
    }
    return 0;
}