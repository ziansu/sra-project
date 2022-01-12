private int makeSerialNumber() {
    java.lang.String res = "1";
    for (int i = 0; i < 15; i++) {
        int k = ((int) ((java.lang.Math.random()) * 10.0));
        res += java.lang.Integer.toString(k);
    }
    return java.lang.Integer.parseInt(res);
}