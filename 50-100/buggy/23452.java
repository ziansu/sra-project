public boolean removeItem(com.lukasz.SearchedItem item) {
    java.util.List<java.lang.String> tagsToRemove = item.getTags();
    boolean result = searchedItems.remove(item);
    tagsToRemove.forEach(( tag) -> com.lukasz.TagMap.removeTag(tag));
    java.lang.System.out.println(com.lukasz.TagMap.getTagMap());
    return result;
}