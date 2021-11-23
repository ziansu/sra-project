public java.util.Map<java.lang.Integer, java.lang.String> getCategoryNames() {
    java.util.Map<java.lang.Integer, java.lang.String> categoryNames = new java.util.HashMap<>();
    if (((mSettings.categories) != null) && ((mSettings.categories.length) > 0)) {
        for (org.wordpress.android.models.CategoryModel model : mSettings.categories) {
            categoryNames.put(model.id, model.name);
        }
    }
    return categoryNames;
}