@java.lang.Override
public java.util.List<pt.uc.dei.nobugssnackbar.model.HintCategory> getHintCategories() throws java.lang.Exception {
    if ((hCategories) == null) {
        hCategories = hintCategoryDao.list();
    }
    return hCategories;
}