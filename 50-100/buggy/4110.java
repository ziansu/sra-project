private void resize(int capacity) {
    Item[] newRandomQueue = ((Item[]) (new java.lang.Object[capacity]));
    for (int i = 0; i < (n); i++) {
        newRandomQueue[i] = randomQueue[i];
    }
    randomQueue = newRandomQueue;
}