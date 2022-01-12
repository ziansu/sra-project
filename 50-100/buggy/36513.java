public void shuffle() {
    for (int i = 0; i < 48; i++) {
        int ts = java.util.concurrent.ThreadLocalRandom.current().nextInt(0, 48);
        litcore.Card temp = new litcore.Card(8, 0);
        temp = fCards[i];
        fCards[i] = fCards[ts];
        fCards[ts] = fCards[i];
    }
}