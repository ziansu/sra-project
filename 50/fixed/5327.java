public void setProductTypeName(java.lang.String name) {
    ch.agilesolutions.oms.model.ProductType productType = productTypeDao.findByName(name);
    this.editableProduct.setProductType(productType);
}