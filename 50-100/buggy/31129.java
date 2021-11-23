public java.math.BigDecimal getDiscountAmount(com.axelor.apps.base.db.PriceListLine priceListLine, java.math.BigDecimal unitPrice) {
    switch (priceListLine.getTypeSelect()) {
        case com.axelor.apps.base.db.IPriceListLine.TYPE_ADDITIONNAL :
            return priceListLine.getAmount();
        case com.axelor.apps.base.db.IPriceListLine.TYPE_DISCOUNT :
            return priceListLine.getAmount().negate();
        case com.axelor.apps.base.db.IPriceListLine.TYPE_REPLACE :
            return priceListLine.getAmount().subtract(unitPrice);
        default :
            return java.math.BigDecimal.ZERO;
    }
}