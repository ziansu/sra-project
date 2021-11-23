public void showProduct(java.util.List<com.jsw.MngProductDatabase.Model.Product> products) {
    if (products != null)
        mAdapter.replace(products);
    
}