private java.lang.String getAnum(int n) {
    java.lang.String anum = "";
    if (n < 10) {
        anum = "0" + anum;
    }else {
        anum = java.lang.Integer.toString(n);
    }
    return anum;
}