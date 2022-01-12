public void onScrolledToBottomOfList() {
    if ((state.pageNumber) < (state.nextPageNumber)) {
        getProducts(state.nextPageNumber, state.pageSize);
    }
}