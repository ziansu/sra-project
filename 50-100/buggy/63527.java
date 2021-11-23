private void resizeLast(int max) {
    Item[] temp = ((Item[]) (new java.lang.Object[max]));
    for (int i = 0; i < (N); i++) {
        temp[(i + (first))] = q[(((first) + i) % (q.length))];
    }
    q = temp;
    last = (first) + (N);
    temp = null;
}