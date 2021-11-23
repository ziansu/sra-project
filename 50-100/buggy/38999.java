public java.math.BigDecimal getGrandTotal() {
    java.math.BigDecimal grandTotal = this.getSubTotal().add(this.getTotalShipping()).add(this.getTotalSalesTax()).add(this.getOrderOtherAdjustmentTotal());
    grandTotal = this.getSubTotal().add(this.getTotalShipping()).add(this.getTotalSalesTax()).add(this.getOrderOtherAdjustmentTotal()).add(getOrderGlobalAdjusments());
    return grandTotal;
}