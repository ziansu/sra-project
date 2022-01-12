public static int findName(java.lang.String name) {
    int ind = -1;
    for (ind = 0; ind < (Assignment3.ShoppingCartDriver.shoppingCart.size()); ind++) {
        if ((Assignment3.ShoppingCartDriver.shoppingCart.get(ind).getName()) == name) {
            break;
        }
    }
    return ind;
}