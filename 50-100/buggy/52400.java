public static java.lang.String lpad(java.lang.String s, int n, java.lang.String r) {
    if ((s.length()) >= n) {
        return s.substring(0, n);
    }else {
        return s + (new java.lang.String(new char[n - (s.length())]).replace(" ", r));
    }
}