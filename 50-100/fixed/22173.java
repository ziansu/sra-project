public int getPrice(int amout) {
    for (int i = (amountTable.length) - 1; i >= 0; i--) {
        if (amout >= (amountTable[i])) {
            return priceTable[i];
        }
    }
    return priceTable[0];
}