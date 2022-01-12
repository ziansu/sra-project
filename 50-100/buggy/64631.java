public int drawCard(boolean isHit) {
    if (isHit = true) {
        java.util.Random rand = new java.util.Random();
        int mCard = (rand.nextInt(((11 - 2) + 1))) + 2;
        return mCard;
    }else {
        return 0;
    }
}