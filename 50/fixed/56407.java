private void initializeTextViewWithShoppingListName() {
    java.lang.String shoppingListName = shoppingListDAO.getOne(shoppingListId).getName();
    getActivity().setTitle(shoppingListName);
}