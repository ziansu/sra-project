private void addLineItem(discountstrategy.LineItem newItem) {
    discountstrategy.LineItem[] temp = new discountstrategy.LineItem[(lineItems.length) + 1];
    java.lang.System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
    temp[lineItems.length] = newItem;
    lineItems = temp;
}