public int getPrice(int amout) {
    for (int i = 0; i < (amountTable.length); i++) {
        if (amout >= (amountTable[i])) {
            return priceTable[i];
        }
    }
    return quote.getMinPrice();
}