@android.support.annotation.NonNull
private io.github.hidroh.materialistic.data.HackerNewsItem[] toItems(int[] ids) {
    io.github.hidroh.materialistic.data.HackerNewsItem[] items = new io.github.hidroh.materialistic.data.HackerNewsItem[ids == null ? 0 : ids.length];
    for (int i = 0; i < (items.length); i++) {
        io.github.hidroh.materialistic.data.HackerNewsItem item = new io.github.hidroh.materialistic.data.HackerNewsItem(ids[i]);
        item.rank = i + 1;
        items[i] = item;
    }
    return items;
}