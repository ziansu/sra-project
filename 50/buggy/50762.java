public java.lang.String findItem(java.lang.String searchItem) {
    int position = groceryList.indexOf(searchItem);
    if (position >= 0) {
        return groceryList.get(position);
    }
    return null;
}