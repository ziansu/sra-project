private static double delta(java.util.LinkedList<double[]> buffer, int index, int amount, double cur) {
    java.util.Iterator<double[]> itr = buffer.descendingIterator();
    int i = 0;
    double prev;
    double totalChange = 0;
    while ((itr.hasNext()) && (i < amount)) {
        prev = cur;
        cur = itr.next()[index];
        totalChange += cur - prev;
    } 
    return totalChange;
}