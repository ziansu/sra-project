public void setProductTypeName(java.lang.String name) {
    ch.agilesolutions.oms.model.ProductType productType = productTypeDao.findByName(name).get(0);
    this.editableProduct.setProductType(productType);
}