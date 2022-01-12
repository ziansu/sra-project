public java.lang.String leftShift(java.lang.String input, int times) {
    java.lang.String temp = input;
    java.lang.StringBuilder strb = new java.lang.StringBuilder();
    for (int i = 0; i < times; i++) {
        strb.append(temp.substring(1));
        strb.append(temp.substring(0, 1));
        temp = strb.toString();
        strb = new java.lang.StringBuilder();
    }
    return temp;
}