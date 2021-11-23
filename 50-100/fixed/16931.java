public void scanProduct(java.lang.String prodId, int qty) {
    PointOfSale.LineItem[] temp = new PointOfSale.LineItem[(lineItem.length) + 1];
    for (int i = 0; i < (lineItem.length); i++) {
        temp[i] = lineItem[i];
    }
    lineItem = temp;
    temp = null;
    lineItem[((lineItem.length) - 1)] = new PointOfSale.LineItem(db.findProduct(prodId), qty);
}