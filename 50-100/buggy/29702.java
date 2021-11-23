public void onResume() {
    com.atoennis.walmartcodechallenge.BusProvider.getInstance().register(this);
    if ((state.selectedProduct) == null) {
        if (moreProductsAvailable()) {
            productService.getProducts(new com.atoennis.walmartcodechallenge.data.ProductService.GetProductsRequest(state.nextPageNumber, state.pageSize));
        }else {
            view.addProductsToList(state.products);
        }
    }
}