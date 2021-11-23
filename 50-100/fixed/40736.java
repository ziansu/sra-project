public int totalValue(java.util.ArrayList<java.lang.Integer> hand) {
    int lowHand = 0;
    int highHand = 0;
    for (int i : hand) {
        if (i == 1) {
            lowHand += i;
            highHand += 11;
        }else {
            lowHand += i;
            highHand += i;
        }
    }
    if (_aces.equals("low"))
        return lowHand;
    else
        if ((_aces.equals("goBothWays")) && (highHand > 21))
            return lowHand;
        else
            return highHand;
        
    
}