public void setStoreInfo(java.lang.String storeInfo) {
    java.lang.String string = getString("storeInfo");
    if (string == null)
        return "";
    
    put("storeInfo", storeInfo);
}