public int update(com.lidchanin.crudindiploma.data.models.ExistingProduct existingProduct) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(DatabaseHelper.COLUMN_ID, existingProduct.getId());
    contentValues.put(DatabaseHelper.COLUMN_LIST_ID, existingProduct.getShoppingListId());
    contentValues.put(DatabaseHelper.COLUMN_PRODUCT_ID, existingProduct.getProductId());
    contentValues.put(DatabaseHelper.COLUMN_QUANTITY_OR_WEIGHT, existingProduct.getQuantityOrWeight());
    return database.update(DatabaseHelper.TABLE_EXISTING_PRODUCTS, contentValues, com.lidchanin.crudindiploma.data.dao.ExistingProductDAO.WHERE_ID_EQUALS, new java.lang.String[]{ java.lang.String.valueOf(existingProduct.getId()) });
}