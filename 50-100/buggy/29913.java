protected <T extends lv.kasparsj.android.feed.FeedItem> T copy(java.lang.Class<T> clazz) {
    try {
        T copy = clazz.newInstance();
        copy.setTitle(title);
        copy.setLink(link.toString());
        copy.setDescription(description);
        copy.setDate(date.toString());
        return copy;
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}