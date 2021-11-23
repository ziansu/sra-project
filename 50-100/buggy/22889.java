public java.util.ArrayList<com.jauer.android.blocspot.api.model.PoiItem> getFilteredList(java.lang.String category) {
    java.util.ArrayList filteredItems = new java.util.ArrayList<>();
    for (com.jauer.android.blocspot.api.model.PoiItem item : allPoiItemsList) {
        if ((category == null) || (item.getCategory().equals(category))) {
            filteredItems.add(item);
        }
    }
    java.util.Collections.sort(filteredItems);
    return filteredItems;
}