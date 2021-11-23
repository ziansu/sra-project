public java.lang.String getLineItemAsString() {
    double discountAmt = product.getCalculatedDiscountAmount(quantity);
    return ((((((((((product.getId()) + "     ") + (product.getName())) + "     ") + (quantity)) + "     ") + (product.getUnitCost())) + "     ") + (getSubtotalDiscountAmount())) + "    ") + (getSubtotal());
}