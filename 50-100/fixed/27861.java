public boolean isNumeric(java.lang.String input) {
    for (int i = 0; i < (input.length()); i++) {
        for (int j = 0; j < 10; j++) {
            if (!(java.lang.Character.isDigit(input.charAt(i)))) {
                return false;
            }
        }
    }
    return true;
}