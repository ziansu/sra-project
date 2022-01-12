boolean match(int nMe, int nAnother) {
    boolean a;
    boolean b;
    if ((iCard[nMe].sSuite) == (iCard[nAnother].sSuite)) {
        a = true;
    }else {
        a = false;
    }
    if ((iCard[nMe].sNum) == (iCard[nAnother].sNum)) {
        b = true;
    }else {
        b = false;
    }
    return a || b;
}