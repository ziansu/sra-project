public void onResume() {
    com.atoennis.walmartcodechallenge.BusProvider.getInstance().register(this);
    if ((state.selectedProduct) == null) {
        if (moreProductsAvailable()) {
            getProducts(state.nextPageNumber, state.pageSize);
        }else {
            view.addProductsToList(state.products);
        }
    }
}