private static java.util.ArrayList<java.lang.Integer> genRCoff(int n) {
    int max = 2147483647;
    java.util.ArrayList<java.lang.Integer> coff = new java.util.ArrayList<java.lang.Integer>();
    while (n > 0) {
        java.util.Random r = new java.util.Random();
        int a = r.nextInt(max);
        while (coff.contains(a)) {
            a = r.nextInt(max);
        } 
        coff.add(a);
        n--;
    } 
    return coff;
}