public void addOrder(homework.models.Order order) {
    orders.add(order);
    int i = Main.prefs.getInt("orders.amount", 0);
    Main.prefs.putInt("orders.amount", (i + 1));
    Main.prefs.put(("orders." + i), order.toString());
}