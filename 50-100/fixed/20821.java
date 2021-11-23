public java.util.List search(java.lang.String query) {
    java.util.List<edu.gatech.cs2340.wheresmystuff.model.Item> searchResults = new java.util.ArrayList<>();
    if (((query == null) || (query.isEmpty())) || (items.isEmpty())) {
        return searchResults;
    }
    for (edu.gatech.cs2340.wheresmystuff.model.Item i : items) {
        if (i.getName().toLowerCase().equals(query.toLowerCase())) {
            searchResults.add(i);
        }
    }
    return searchResults;
}