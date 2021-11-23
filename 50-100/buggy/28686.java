@java.lang.Override
public void notify(java.util.List<com.talkramer.finalproject.model.Domain.Product> products) {
    java.util.List<com.talkramer.finalproject.model.Domain.Product> updatedProducts;
    java.lang.String lastUpdateDate;
    lastUpdateDate = com.talkramer.finalproject.model.Domain.ProductSql.getLastUpdateDate(sqlModel.getReadbleDB());
    updatedProducts = updateLocalProducts(products, lastUpdateDate);
    if ((uiListener) != null)
        uiListener.notify(updatedProducts);
    
}