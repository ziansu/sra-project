private void addLineItem(discountstrategy.LineItem newItem) {
    discountstrategy.LineItem[] temp = new discountstrategy.LineItem[lineItems.length];
    java.lang.System.arraycopy(lineItems, 0, temp, 0, ((lineItems.length) - 1));
    temp[((lineItems.length) - 1)] = newItem;
    lineItems = temp;
}