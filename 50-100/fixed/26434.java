public boolean checkCase1_5(java.lang.String s) {
    java.lang.String c = prefixReversal(n, prefixReversal(nT, s));
    if ((c.substring(nT).equals(d.substring(nT))) && (!(c.equals(d)))) {
        return true;
    }else {
        return false;
    }
}