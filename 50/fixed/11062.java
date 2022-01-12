public java.lang.Boolean doesCategoryExist(java.lang.String categoryName) {
    long value = this.getEntityId(ProductContract.CategoryEntity.TABLE_NAME, ProductContract.CategoryEntity.COLUMN_TITLE, categoryName);
    return value >= 0;
}