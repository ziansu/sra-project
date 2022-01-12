public void allSellingProducts(com.farfromsober.network.callbacks.OnDataParsedCallback<java.lang.Object> onDataParsedCallback) {
    com.farfromsober.ffs.model.LoginData loginData = com.farfromsober.ffs.utils.SharedPreferencesManager.getPrefLoginUser(mContext);
    java.util.HashMap<java.lang.String, java.lang.Object> urlParams = new java.util.HashMap<>();
    urlParams.put("selling", 2);
    com.farfromsober.network.APIRequest apiRequest = new com.farfromsober.network.APIRequest(com.farfromsober.ffs.network.APIManager.PRODUCTS_URL, com.farfromsober.network.APIAsyncTask.ApiRequestType.GET, loginData.getHeaders(), null, null, 10000, 10000);
    com.farfromsober.network.APIAsyncTask allProductsAsyncTask = new com.farfromsober.network.APIAsyncTask(apiRequest, this, onDataParsedCallback, com.farfromsober.ffs.model.Product.class);
    allProductsAsyncTask.execute();
}