private void resize(boolean up) {
    Item[] tempArray = queueArray;
    int factor = (up) ? 2 : 1 / 2;
    if (factor < 1) {
        factor = 1;
    }
    queueArray = ((Item[]) (new java.lang.Object[(queueArray.length) * factor]));
    for (int i = 0; i < (tail); i++) {
        queueArray[i] = tempArray[i];
    }
}