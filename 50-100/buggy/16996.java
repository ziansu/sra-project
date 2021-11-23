public static void challenge2() {
    int sum;
    for (int dc = 400; dc <= 600; dc += 200) {
        sum = 1000 + dc;
        for (int lx = 40; lx <= 60; lx += 20) {
            sum += lx;
            for (int vi = 4; vi <= 6; vi += 2) {
                sum += vi;
                java.lang.System.out.println(java.lang.Integer.toString(sum));
            }
        }
    }
}