public tw.teddysoft.bdd.domain.invoice.InvoiceBuilder withTaxExcludedPrice(java.lang.Integer arg1) {
    if ((this.taxIncludedPrice) > 0)
        this.taxIncludedPrice = 0;
    
    this.taxExcludedPrice = arg1;
    return this;
}