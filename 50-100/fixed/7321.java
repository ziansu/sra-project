public static com.coast.model.ResultMSG doSell(java.lang.String shopinFilePath, java.lang.String outPutFilePath) {
    com.coast.model.ResultMSG resultMSG = new com.coast.model.ResultMSG();
    resultMSG.setErrorMessage("");
    com.coast.service.SellService sellService = new com.coast.service.impl.SellServiceImpl();
    java.util.List<com.coast.model.Product> products = sellService.getProductsFromShopinSellExcel(shopinFilePath, resultMSG);
    sellService.write(products, outPutFilePath, resultMSG, shopinFilePath);
    return resultMSG;
}