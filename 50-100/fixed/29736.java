public void generateOrder(java.lang.String poID) {
    java.util.List<com.qac.row5project.entities.Stock> stock = new java.util.ArrayList<com.qac.row5project.entities.Stock>();
    com.qac.row5project.entities.Stock e = stockManager.findStocksbyID(java.lang.Integer.parseInt(poID));
    stock.add(e);
    com.qac.row5project.entities.PurchaseOrder po = new com.qac.row5project.entities.PurchaseOrder(0, null);
    po.setStockList(stock);
}