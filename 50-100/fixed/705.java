public void suffle() {
    java.util.Random rand = new java.util.Random();
    int swap = 0;
    for (int i = 1; i <= 51; i++) {
        swap = rand.nextInt(i);
        swap -= 1;
        if ((swap >= 0) && (swap < 53)) {
            this.swapElemente(cardHolder.get(swap).toString(), cardHolder.get(i).toString());
        }
    }
}