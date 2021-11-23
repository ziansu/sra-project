public static java.sql.Date parseDate(java.lang.String str) {
    java.lang.String[] s = str.split("/");
    return new java.sql.Date(((java.lang.Integer.parseInt(s[2])) - 1900), ((java.lang.Integer.parseInt(s[0])) - 1), java.lang.Integer.parseInt(s[1]));
}