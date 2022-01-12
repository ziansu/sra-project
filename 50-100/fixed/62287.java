private java.lang.String getProductLabel(uk.chromis.pos.ticket.ProductInfoExt product) {
    if (pricevisible) {
        if (taxesincluded) {
            uk.chromis.pos.ticket.TaxInfo tax = taxeslogic.getTaxInfo(product.getTaxCategoryID());
            return (("<html><center>" + (product.printPriceSellTax(tax))) + "<br>") + (product.getDisplay());
        }else {
            return (("<html><center>" + (product.printPriceSell())) + "<br>") + (product.getDisplay());
        }
    }else {
        return product.getDisplay();
    }
}