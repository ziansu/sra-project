@org.junit.Test
public void editCategory_shouldCallAddCategoryToDao() {
    edu.com.softserveinc.bawl.models.CategoryModel mockCategoryModel = org.mockito.Mockito.mock(edu.com.softserveinc.bawl.models.CategoryModel.class);
    org.mockito.Mockito.when(categoryService.getCategoryByID(1)).thenReturn(mockCategoryModel);
    categoryService.updateCategory(1, "foo", CategoryState.NEW);
    org.mockito.Mockito.verify(categoryDao, org.mockito.Mockito.times(1)).saveAndFlush(mockCategoryModel);
}