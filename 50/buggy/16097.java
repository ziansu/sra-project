@java.lang.Override
public void updateCategory(int id, java.lang.String name, edu.com.softserveinc.bawl.models.enums.CategoryState state) {
    edu.com.softserveinc.bawl.models.CategoryModel categoryModel = getCategoryByID(id);
    categoryModel.setName(name);
    categoryModel.setState(state);
    categoryDao.saveAndFlush(categoryModel);
}