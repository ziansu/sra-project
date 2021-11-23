public java.lang.String trovaProdotto(java.lang.String codice) {
    this.prodotto = productFacade.getProduct(codice);
    return "prodotto";
}