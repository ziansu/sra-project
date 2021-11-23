public boolean addItem(com.lukasz.SearchedItem item) {
    boolean result = searchedItems.add(item);
    java.util.ListIterator<java.lang.String> i = item.getTags().listIterator();
    while (i.hasNext()) {
        com.lukasz.TagMap.getTagMap().put(i.next().toUpperCase(), item);
    } 
    return result;
}