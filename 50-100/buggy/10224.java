public int getTagNameId(java.lang.CharSequence tagName) {
    int id;
    if (tagNames.containsKey(tagName)) {
        id = tagNames.size();
        tagNames.put(tagName, id);
    }else {
        id = tagNames.get(tagName);
    }
    return id;
}