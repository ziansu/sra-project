boolean match(int nMe, int nAnother) {
    boolean a;
    boolean b;
    if (iCard[nMe].sSuite.equals(iCard[nAnother].sSuite)) {
        a = true;
    }else {
        a = false;
    }
    if (iCard[nMe].sNum.equals(iCard[nAnother].sNum)) {
        b = true;
    }else {
        b = false;
    }
    return a || b;
}