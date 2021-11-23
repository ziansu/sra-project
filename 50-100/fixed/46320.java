public java.math.BigDecimal computeDiscount(java.math.BigDecimal unitPrice, int discountTypeSelect, java.math.BigDecimal discountAmount) {
    if (discountTypeSelect == (com.axelor.apps.base.db.IPriceListLine.AMOUNT_TYPE_FIXED)) {
        return unitPrice.subtract(discountAmount).setScale(generalService.getNbDecimalDigitForUnitPrice(), java.math.RoundingMode.HALF_UP);
    }else
        if (discountTypeSelect == (com.axelor.apps.base.db.IPriceListLine.AMOUNT_TYPE_PERCENT)) {
            return unitPrice.multiply(java.math.BigDecimal.ONE.subtract(discountAmount.divide(new java.math.BigDecimal(100), generalService.getNbDecimalDigitForUnitPrice(), java.math.RoundingMode.HALF_UP))).setScale(generalService.getNbDecimalDigitForUnitPrice(), java.math.RoundingMode.HALF_UP);
        }
    
    return unitPrice;
}