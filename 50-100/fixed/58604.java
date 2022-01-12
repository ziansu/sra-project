private double calcTotalCost() {
    double cost = 0;
    for (java.awt.Component com : jpStoreCart.getComponents()) {
        if (com instanceof imatproject.components.ShoppingCartListEntry) {
            imatproject.components.ShoppingCartListEntry entry = ((imatproject.components.ShoppingCartListEntry) (com));
            cost = cost + (entry.getTotal());
        }
    }
    return cost;
}