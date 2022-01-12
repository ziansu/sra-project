public static com.example.fishon.stocklist.StockItem fromJsonObject(org.json.JSONObject jsonObject) throws org.json.JSONException {
    java.lang.String name = jsonObject.getString(com.example.fishon.stocklist.StockItem.KEY_NAME);
    java.lang.String code = jsonObject.getString(com.example.fishon.stocklist.StockItem.KEY_CODE);
    boolean inStock;
    inStock = (!(jsonObject.has(com.example.fishon.stocklist.StockItem.KEY_IN_STOCK))) || (jsonObject.getBoolean(com.example.fishon.stocklist.StockItem.KEY_IN_STOCK));
    com.example.fishon.stocklist.StockItem stockItem = new com.example.fishon.stocklist.StockItem(name, code);
    stockItem.setInStock(inStock);
    return stockItem;
}