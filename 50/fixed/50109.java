public int rollDice() {
    java.util.Random rand = new java.util.Random();
    while (true) {
        int i = (rand.nextInt(6)) + 1;
        return i;
    } 
}