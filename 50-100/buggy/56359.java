public static java.lang.String remplaceEtoiles(java.lang.String MotSecret) {
    java.lang.String MotUser = "";
    for (byte o = 0; o < (MotSecret.length()); o++) {
        if ((MotSecret.charAt(o)) == '-') {
            MotUser = MotUser + "-";
        }else {
            MotUser = MotUser + "*";
        }
    }
    return MotUser;
}