private void initializeData(long shoppingListId) {
    products = productDAO.getAllFromCurrentShoppingList(shoppingListId);
    if ((products) == null) {
        products = new java.util.ArrayList<>();
    }
    existingProducts = existingProductDAO.getAllFromCurrentShoppingList(shoppingListId);
    if ((existingProducts) == null) {
        existingProducts = new java.util.ArrayList<>();
    }else {
        calculationOfEstimatedAmount(existingProducts);
    }
}