public java.lang.String getLineItemAsString() {
    return ((((((((((product.getId()) + "     ") + (product.getName())) + "     ") + (quantity)) + "     ") + (product.getUnitCost())) + "     ") + (getSubtotalDiscountAmount())) + "    ") + (getSubtotal());
}