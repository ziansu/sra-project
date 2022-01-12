private void initializeData(long shoppingListId) {
    shoppingListDAO.open();
    productDAO.open();
    existingProductDAO.open();
    products = productDAO.getAllFromCurrentShoppingList(shoppingListId);
    if ((products) == null) {
        products = new java.util.ArrayList<>();
    }
    existingProducts = existingProductDAO.getAllFromCurrentShoppingList(shoppingListId);
    if ((existingProducts) == null) {
        existingProducts = new java.util.ArrayList<>();
    }else {
        calculationOfEstimatedAmount(products, existingProducts);
    }
}