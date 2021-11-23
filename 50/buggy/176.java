public void clearCache() {
    com.sun.javafx.css.StyleHelper.StyleCacheEntry entry = styleCache.get(this);
    entry.entries.clear();
}