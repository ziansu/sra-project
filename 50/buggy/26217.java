boolean moreProductsAvailable() {
    return (state.products.size()) < (state.totalProducts);
}