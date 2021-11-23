private int getCategoryId() {
    int categoryId = getIntent().getIntExtra(com.kosbrother.mongmongwoo.ProductActivity.EXTRA_INT_CATEGORY_ID, 0);
    return categoryId == 0 ? 10 : categoryId;
}