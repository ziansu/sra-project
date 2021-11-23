public float getPrice(int productPriceId, int productId, int priceCategoryId, int currencyId, java.sql.Timestamp time, int timeframeId, int addressId, java.sql.Date exactDate) throws java.rmi.RemoteException, java.sql.SQLException {
    return getStockroomBusiness().getPrice(productPriceId, productId, priceCategoryId, currencyId, time, timeframeId, addressId);
}