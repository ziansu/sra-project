public void addItem(java.lang.String product, java.lang.String num) {
    ORDER_ITEMS.add(new com.example.kbpark.frontbeaconmonitor.Order.OrderItem(product, num));
    this.notifyDataSetChanged();
}