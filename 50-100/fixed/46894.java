public java.lang.String makeIMarks(int number) {
    java.lang.String roman = "";
    while (number >= 1) {
        for (int i = number; i >= 1; i--) {
            if (number <= 0) {
                break;
            }
            if (numerals.containsKey(i)) {
                roman += ((java.lang.String) (numerals.get(i)));
                number -= i;
            }
        }
    } 
    return roman;
}