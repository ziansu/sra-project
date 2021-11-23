private int calculatePrice(int quantity, boolean hasWhipped, boolean hasChocolate) {
    int price = 5;
    if (hasChocolate) {
        price += 2;
    }
    if (hasWhipped) {
        price += 1;
    }
    return price * quantity;
}