private void updateSearchItemsWithTokens(java.lang.String token) {
    items.clear();
    for (int i = 0; i < (searchItems.size()); i++) {
        if (searchItems.get(i).toString().contains(token)) {
            items.add(searchItems.get(i));
        }
    }
}