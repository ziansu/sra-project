@java.lang.Override
public void onNext(java.util.List<com.ayuget.redface.data.api.model.Category> categories) {
    populateNavDrawerCategories(categories);
    onCategoriesLoaded();
}