private java.lang.String toBinaryString(java.lang.String s) {
    byte[] ba;
    java.lang.StringBuilder ret = new java.lang.StringBuilder();
    ba = s.getBytes();
    for (byte b : ba) {
        ret.append(fillLeftWithZeros(java.lang.Integer.toBinaryString(((int) (b))), 7));
    }
    return ret.toString();
}