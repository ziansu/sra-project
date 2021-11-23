public void deleteProductFromCart(com.android.grubox.models.ProductResponse productModel) {
    com.android.grubox.databaseutils.VendingDatabase vendingDatabase = new com.android.grubox.databaseutils.VendingDatabase(this);
    try {
        vendingDatabase.open();
        vendingDatabase.deleteEntryforcart(productModel.getRow_id());
        vendingDatabase.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    cartFragment.refreshCart();
    updateTotal();
}