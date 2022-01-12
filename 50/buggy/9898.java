public java.lang.String detailProduit(int idProduit) {
    this.idProductRef = idProduit;
    this.productRef = proxyCatalog.getProductRefById(idProductRef);
    return "/pages/detailproduit.xhtml?faces-redirect=true";
}