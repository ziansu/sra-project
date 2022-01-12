public void prepareListData() {
    listDataHeader = new java.util.ArrayList<>();
    listDataChild = new java.util.HashMap<>();
    int i = 0;
    java.util.List<groceryproject.jacob.com.recipelist.GroceryListItem> groceries;
    groceries = dbHelper.getAllGroceries();
    for (groceryproject.jacob.com.recipelist.GroceryListItem grocery : groceries) {
        listDataHeader.add(grocery.getRecipeName());
        listDataChild.put(listDataHeader.get(i), grocery.getIngredients());
        i++;
    }
}