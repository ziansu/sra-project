@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_test_page_hit);
    java.util.Map<java.lang.String, java.lang.String> lMap = new java.util.HashMap<java.lang.String, java.lang.String>();
    lMap.put("item_id", "xxxxxx");
    com.alibaba.sdk.android.man.MANService manService = com.alibaba.sdk.android.AlibabaSDK.getService(com.alibaba.sdk.android.man.MANService.class);
    manService.getMANPageHitHelper().updatePageProperties(lMap);
}