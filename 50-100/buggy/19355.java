private  checkStraight(java.util.ArrayList<com.jvpoker.Player> wl) {
    {
        com.jvpoker.Card topCard = wl[0].getHighCard();
        for (int idx = 1; idx < (wl.size()); idx++) {
            if ((wl[idx].compareTo(topCard)) == 1) {
                topCard = wl[idx];
            }
        }
    }
}