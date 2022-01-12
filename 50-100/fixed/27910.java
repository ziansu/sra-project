public void addItem(WholeItem item, int quantity) {
    if (basket.keySet().contains(item)) {
        int newQuantity = (basket.get(item).intValue()) + quantity;
        basket.put(item, newQuantity);
    }else {
        basket.put(item, quantity);
    }
}