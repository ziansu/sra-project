private long encode(java.lang.String input) {
    java.lang.String rtn = "";
    java.lang.String first5 = input.toLowerCase().concat("      ").substring(0, 5);
    int ascii;
    for (int i = 0; i < 5; ++i) {
        ascii = ((int) (first5.charAt(i)));
        rtn = rtn.concat(java.lang.String.valueOf(ascii));
    }
    return java.lang.Long.parseLong(rtn);
}