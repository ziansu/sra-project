private java.lang.String toBinaryString(java.lang.String s) {
    byte[] ba;
    java.lang.String ret = "";
    ba = s.getBytes();
    for (byte b : ba) {
        ret += fillLeftWithZeros(java.lang.Integer.toBinaryString(((int) (b))), 7);
    }
    return ret;
}