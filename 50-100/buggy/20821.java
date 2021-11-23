public java.util.List search(java.lang.String query) {
    java.util.List<edu.gatech.cs2340.wheresmystuff.model.Item> searchResults = new java.util.ArrayList<>();
    if ((query == null) || (query.isEmpty())) {
        return searchResults;
    }
    for (edu.gatech.cs2340.wheresmystuff.model.Item i : items) {
        if (i.getName().equals(query)) {
            searchResults.add(i);
        }
    }
    return searchResults;
}