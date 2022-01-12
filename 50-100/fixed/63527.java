private void resizeLast(int max) {
    Item[] temp = ((Item[]) (new java.lang.Object[(first) + max]));
    for (int i = first; i < ((N) + (first)); i++) {
        temp[i] = q[(i % (q.length))];
    }
    q = temp;
    last = (first) + (N);
    temp = null;
}