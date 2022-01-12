public void addItem(int quantity, WholeItem item) {
    if (basket.keySet().contains(item)) {
        int newQuantity = (basket.get(item).intValue()) + quantity;
        basket.put(item, newQuantity);
    }else {
        basket.put(item, quantity);
    }
}