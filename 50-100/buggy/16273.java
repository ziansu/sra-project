private java.lang.Boolean setPrice(java.lang.String attributeValue, java.math.BigDecimal existingPrice, hci.gnomex.model.Price price, java.lang.String whichPrice) {
    java.lang.Boolean modified = false;
    try {
        modified = hci.gnomex.utility.PriceUtil.setPrice(attributeValue, price.getUnitPrice(), price, whichPrice);
    } catch (java.lang.NumberFormatException e) {
        hci.gnomex.controller.SaveExperimentPlatform.log.error(("Unable to parse price: " + attributeValue), e);
    }
    return modified;
}