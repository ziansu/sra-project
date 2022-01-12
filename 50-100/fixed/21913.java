public java.lang.String delDel(java.lang.String str) {
    if ((str.contains("del")) && ((str.indexOf("del")) == 1)) {
        java.lang.String frontString = str.substring(0, str.indexOf("del"));
        java.lang.String backString = str.substring(((str.indexOf("del")) + 3), str.length());
        str = frontString + backString;
    }
    return str;
}