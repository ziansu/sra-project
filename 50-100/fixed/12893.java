private static void compareHands(java.util.List<java.lang.Integer> x, java.util.List<java.lang.Integer> y, boolean[] a, boolean[] b) {
    int buildValue1 = week1Problems.P6.findValue(a);
    int buildValue2 = week1Problems.P6.findValue(b);
    if (buildValue1 > buildValue2) {
        java.lang.System.out.println("Player 1 wins");
    }else
        if (buildValue1 == buildValue2) {
            week1Problems.P6.compareHigh(x, y);
        }else {
            java.lang.System.out.println("Player 2 wins");
        }
    
}