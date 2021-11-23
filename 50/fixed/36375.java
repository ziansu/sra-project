public webeng.transferobjects.Product getProduct(int id) {
    return getProducts().get((id - 1));
}