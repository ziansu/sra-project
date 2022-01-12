protected void addProduct(java.lang.String name, long checked) {
    com.e16din.shoppinglist.model.Product item = new com.e16din.shoppinglist.model.Product(name, org.joda.time.DateTime.now().getMillis());
    item.setOwnerId(mShoppingList.getId());
    if (checked != 0) {
        item.setChecked(checked);
    }
    mAdapter.add(item);
    item.insert();
}