public static java.util.LinkedList<utility.Pair> descendingThreshold(java.util.LinkedList<java.lang.Integer> terminalOrder) {
    java.util.LinkedList<utility.Pair> order = new java.util.LinkedList<>();
    for (int i = 0; i < (terminalOrder.size()); i++) {
        order.add(new utility.Pair(terminalOrder.get(i), library.StdRandom.uniform(0.0, 0.464102)));
    }
    java.util.Collections.sort(order, java.util.Collections.reverseOrder());
    return order;
}