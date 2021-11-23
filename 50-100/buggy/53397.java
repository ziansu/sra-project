public java.lang.Integer[] toBinary(int i) {
    java.util.List<java.lang.Integer> l = new java.util.ArrayList<java.lang.Integer>();
    while (i > 0) {
        if ((i % 2) == 0) {
            l.add(1);
        }else {
            l.add(0);
        }
        i /= 2;
    } 
    java.lang.Integer[] binary = new java.lang.Integer[l.size()];
    binary = l.toArray(binary);
    return binary;
}