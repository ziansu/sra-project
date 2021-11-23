private java.lang.String addCommasToNumericString(java.lang.String number) {
    java.lang.String newString = "";
    for (int i = 0; i < (number.length()); i++) {
        if (((((number.length()) - i) % 3) == 0) && ((number.length()) > 3)) {
            newString += ",";
        }
        newString += number.charAt(i);
    }
    return newString;
}