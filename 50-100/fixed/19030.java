private java.util.List<com.csci448.freshapps.keepitfresh.Item> filterByLocation(java.util.List<com.csci448.freshapps.keepitfresh.Item> items, java.lang.String location) {
    java.util.ArrayList<com.csci448.freshapps.keepitfresh.Item> filteredItems = new java.util.ArrayList<>();
    for (com.csci448.freshapps.keepitfresh.Item item : items) {
        if ((item.getLocation()) == null)
            continue;
        
        if (item.getLocation().equals(location)) {
            filteredItems.add(item);
        }
    }
    return filteredItems;
}