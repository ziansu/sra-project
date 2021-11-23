public void insertOrder(Simulator.Order order) {
    long price = order.getPrice();
    java.util.TreeMap<java.lang.Long, java.util.LinkedList<Simulator.Order>> sideBook = getSideBook(order.getSide());
    if (sideBook.containsKey(price)) {
        java.util.LinkedList<Simulator.Order> entries = sideBook.get(price);
        entries.add(order);
    }else {
        java.util.LinkedList<Simulator.Order> entries = new java.util.LinkedList();
        entries.add(order);
        sideBook.put(price, entries);
    }
}