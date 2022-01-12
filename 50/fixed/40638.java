public tw.teddysoft.bdd.domain.invoice.InvoiceBuilder withTaxExcludedPrice(int taxExcludedPrice) {
    if ((this.taxIncludedPrice) > 0)
        this.taxIncludedPrice = 0;
    
    this.taxExcludedPrice = taxExcludedPrice;
    return this;
}