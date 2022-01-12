public void shuffleDeck(java.util.ArrayList<java.lang.Integer> cards) {
    java.util.Random rand = new java.util.Random();
    for (int i = cards.size(); i > 1; i--) {
        int j = rand.nextInt(i);
        int temp = cards.get((i - 1));
        cards.set((i - 1), cards.get(j));
        cards.set(j, temp);
    }
}