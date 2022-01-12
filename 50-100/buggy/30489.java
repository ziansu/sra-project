public static java.lang.String ordinal(int i) {
    java.lang.String[] sufixes = new java.lang.String[]{ "th" , "st" , "nd" , "rd" , "th" , "th" , "th" , "th" , "th" , "th" };
    switch (i % 100) {
        case 11 :
        case 12 :
        case 13 :
            return i + "th";
        default :
            return i + (sufixes[(i % 10)]);
    }
}