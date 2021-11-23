public com.example.juanrubio.fbla_app_final.Item[] searchItem(java.lang.String itemName) {
    com.example.juanrubio.fbla_app_final.Item[] searchResults = new com.example.juanrubio.fbla_app_final.Item[items.size()];
    int currentIndex = 0;
    for (int i = 1; i < (items.size()); i++) {
        if (items.get(i).getName().contains(itemName)) {
            searchResults[currentIndex] = items.get(i);
            currentIndex++;
        }
        return searchResults;
    }
    return null;
}