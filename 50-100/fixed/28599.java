private void runQuery(com.salesforce.androidsdk.smartstore.store.SmartStore smartStore, com.salesforce.androidsdk.smartstore.store.QuerySpec querySpec, final com.facebook.react.bridge.Callback successCallback) throws org.json.JSONException {
    final com.salesforce.androidsdk.smartstore.store.StoreCursor storeCursor = new com.salesforce.androidsdk.smartstore.store.StoreCursor(smartStore, querySpec);
    com.salesforce.androidsdk.reactnative.bridge.SmartStoreReactBridge.getSmartStoreCursors(smartStore).put(storeCursor.cursorId, storeCursor);
    org.json.JSONObject result = storeCursor.getData(smartStore);
    com.salesforce.androidsdk.reactnative.bridge.ReactBridgeHelper.invokeSuccess(successCallback, result);
}