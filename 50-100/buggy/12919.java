public java.lang.String cardToString() {
    java.lang.String ret = "";
    if (((value) == 1) || ((value) == 11)) {
        ret = "A";
    }
    if ((value) == 21) {
        ret = "J";
    }
    if ((value) == 22) {
        ret = "Q";
    }
    if ((value) == 23) {
        ret = "K";
    }else {
        ret = value;
    }
    return ret;
}