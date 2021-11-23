public java.util.List<java.lang.String> trimCategories(java.util.List<java.lang.String> categories, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map) {
    for (int i = 0; i < (categories.size()); i++) {
        java.lang.String category = categories.get(i);
        if (!(map.containsKey(category))) {
            categories.remove(category);
            android.util.Log.i("catRemoved", category);
        }
    }
    return categories;
}