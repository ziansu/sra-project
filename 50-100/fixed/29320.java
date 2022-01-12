public int checkWin() {
    int result = -1;
    com.example.allisonkuo.restaurantassistant.Hand myHand;
    com.example.allisonkuo.restaurantassistant.Hand otherHand;
    if ((playerId) == 0) {
        myHand = p1.getHand();
        otherHand = p2.getHand();
    }else {
        myHand = p2.getHand();
        otherHand = p1.getHand();
    }
    if ((myHand != null) && (otherHand != null))
        result = myHand.Compare(otherHand);
    
    return -1;
}