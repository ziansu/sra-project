@java.lang.Override
public java.util.List<com.innovaee.eorder.entity.Category> getAllCategories() {
    java.util.List<com.innovaee.eorder.entity.Category> categories = categoryDao.loadAll();
    for (com.innovaee.eorder.entity.Category category : categories) {
        if (category.getName().equals(Constants.DEFAULT_CATEGORY)) {
            categories.remove(category);
        }
    }
    return categories;
}