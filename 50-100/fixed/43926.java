private void loadShoppingItems() {
    shopItemsSubscription = com.carezone.carezoneshopper.ui.adapters.ShopItemsAdapter.createLoader(this.getApplicationContext()).subscribeOn(rx.schedulers.Schedulers.newThread()).observeOn(rx.android.schedulers.AndroidSchedulers.mainThread()).subscribe(new rx.functions.Action1<android.database.Cursor>() {
        @java.lang.Override
        public void call(android.database.Cursor cursor) {
            shopItemsAdapter.changeCursor(cursor);
        }
    });
}