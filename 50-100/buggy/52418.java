private static int evaluateByHighCard(java.util.ArrayList<Card> h1, java.util.ArrayList<Card> h2) {
    java.lang.System.out.println(h1);
    int firstCardComparison = h1.get(0).compareTo(h2.get(0));
    if ((h1.size()) == 1) {
        return firstCardComparison;
    }else
        if (firstCardComparison == 0) {
            h1.remove(0);
            h2.remove(0);
            return Poker.evaluateByHighCard(h1, h2);
        }else {
            return firstCardComparison;
        }
    
}