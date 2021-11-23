public void shuffleObjects() {
    java.util.Random rand = new java.util.Random();
    int j;
    for (int i = (Sim.NUM_DOORS) - 1; i > 0; i--) {
        j = (rand.nextInt()) % (i + 1);
        swap(i, j);
    }
}