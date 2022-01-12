public java.lang.String makeIMarks(int number) {
    java.lang.String roman = "";
    while (number > 0) {
        for (int i = number; i >= 0; i--) {
            if (numerals.containsKey(i)) {
                roman += ((java.lang.String) (numerals.get(i)));
                number -= i;
            }
        }
    } 
    return roman;
}