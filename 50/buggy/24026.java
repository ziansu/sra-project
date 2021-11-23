public int getSum() {
    int sum = 0;
    for (Item item : items) {
        sum += items.getPrice();
    }
    return sum;
}