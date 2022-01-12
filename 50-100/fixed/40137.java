public static int findName(java.lang.String name) {
    int ind = -1;
    if ((Assignment3.ShoppingCartDriver.shoppingCart.size()) == 0) {
        return ind;
    }
    for (ind = 0; ind < (Assignment3.ShoppingCartDriver.shoppingCart.size()); ind++) {
        if (Assignment3.ShoppingCartDriver.shoppingCart.get(ind).getName().equals(name)) {
            return ind;
        }
    }
    return -1;
}