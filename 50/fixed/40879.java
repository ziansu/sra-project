public static java.util.List<backend.Category> getCategoriesByBudgetID(int bid) {
    java.lang.String query = ("SELECT * FROM Categories where bid = " + bid) + ";";
    java.util.List<backend.Category> categoryList;
    categoryList = backend.CategoryManager.getCategoriesByQuery(query);
    return categoryList;
}