public void refresh() {
    items.clear();
    for (com.beautypop.viewmodel.CategoryVM vm : com.beautypop.app.CategoryCache.getTrendCategories()) {
        items.add(vm);
    }
    feedAdapter.notifyDataSetChanged();
}