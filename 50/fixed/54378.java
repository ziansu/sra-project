@java.lang.Override
public void deleteCategory(int id) {
    edu.com.softserveinc.bawl.models.CategoryModel categoryModel = getCategoryByID(id).get();
    categoryModel.setState(edu.com.softserveinc.bawl.models.enums.CategoryState.DELETED);
    categoryDao.saveAndFlush(categoryModel);
}