private java.lang.String getProductLabel(uk.chromis.pos.ticket.ProductInfoExt product) {
    if (pricevisible) {
        if (taxesincluded) {
            uk.chromis.pos.ticket.TaxInfo tax = taxeslogic.getTaxInfo(product.getTaxCategoryID());
            return (("<html><center>" + (product.getName())) + "<br>") + (product.printPriceSellTax(tax));
        }else {
            return (("<html><center>" + (product.getDisplay())) + "<br>") + (product.printPriceSell());
        }
    }else {
        return product.getDisplay();
    }
}