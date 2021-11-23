private int rollDice() {
    java.util.Random rand = new java.util.Random();
    while (true) {
        int i = (rand.nextInt(6)) + 1;
        if (i != 0) {
            return i;
        }
    } 
}