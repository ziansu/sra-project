public void updateCategory(long categoryId, com.timsteff.pm.domain.Category category) {
    com.timsteff.pm.domain.Category existingCategory = com.timsteff.pm.services.CategoryServiceMock.categories.get(categoryId);
    existingCategory.setCategoryCode(category.getCategoryCode());
    existingCategory.setCategoryName(category.getCategoryName());
    com.timsteff.pm.services.CategoryServiceMock.categories.put(categoryId, existingCategory);
}