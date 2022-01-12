public void updateSizeList(javax.faces.event.AjaxBehaviorEvent event) {
    listProduct = service.getProductsForConiferType(ch.hearc.ig.odi.epicearc.business.ConiferType.valueOf(coniferToBook.getCode()));
    productToBook = null;
}