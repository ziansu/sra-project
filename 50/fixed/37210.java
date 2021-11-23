private void modifyGroceryItem(int position, java.lang.String newItem) {
    groceryList.set(position, newItem);
    java.lang.System.out.println((("Grocery item #" + (position + 1)) + " has been modified."));
}