@java.lang.Override
public void handleProductSearchResult(java.util.List<com.wheretoshop.model.Product> products) {
    if ((productAdapter) != null) {
        if (products != null) {
            productAdapter.clear();
            productAdapter.addAll(products);
            productAdapter.notifyDataSetChanged();
        }else {
            android.util.Log.e(com.wheretoshop.controller.ProductSearchActivity.LOG_TAG, "No products from search results.");
        }
    }else {
        android.util.Log.e(com.wheretoshop.controller.ProductSearchActivity.LOG_TAG, "Error: productAdapter is null in handleProductSearchResult(List)");
    }
}