@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.inject(this, this);
    shopItemsAdapter = new com.carezone.carezoneshopper.ui.adapters.ShopItemsAdapter(this, null);
    shopItemsList.setAdapter(shopItemsAdapter);
    ptrLayout.setLastUpdateTimeRelateObject(this);
    ptrLayout.setPtrHandler(this);
    syncItems();
}