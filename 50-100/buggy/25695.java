public float calculatePrice(int quantity) {
    float price = 0;
    for (int i = 0; i <= quantity; i++) {
        price += Asks.get(i).getPrice();
        price += Bids.get(i).getPrice();
    }
    price = price / (quantity * 2);
    return price;
}