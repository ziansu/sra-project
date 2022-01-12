private java.lang.String encode(java.lang.String input) {
    java.lang.String rtn = "";
    java.lang.String first5 = input.toLowerCase().concat("      ").substring(0, 5);
    for (int i = 0; i < 5; ++i) {
        int ascii = ((int) (first5.charAt(i)));
        rtn = rtn.concat(java.lang.String.valueOf(ascii));
    }
    return java.lang.String.valueOf(java.lang.Long.parseLong(rtn));
}