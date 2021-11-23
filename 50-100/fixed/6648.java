public com.intplus.shoppingspace.model.Shop getShopById(int sid) {
    com.intplus.shoppingspace.model.Shop currentShop = null;
    try {
        com.intplus.shoppingspace.controller.AppController.shopDatabase = new com.intplus.shoppingspace.model.ShopDatabase(this.activity);
        com.intplus.shoppingspace.controller.AppController.shopDatabase.open();
        currentShop = com.intplus.shoppingspace.controller.AppController.shopDatabase.shopsDao.fetchShopBySid(sid);
    } catch (java.lang.Exception e) {
        android.util.Log.e(com.intplus.shoppingspace.controller.AppController.APPLOG, (("Shop with given id:" + sid) + "is not found"));
    } finally {
        com.intplus.shoppingspace.controller.AppController.shopDatabase.close();
        android.util.Log.e(com.intplus.shoppingspace.controller.AppController.APPLOG, "Db is closed");
    }
    return currentShop;
}