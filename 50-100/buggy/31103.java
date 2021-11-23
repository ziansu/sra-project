@java.lang.Override
public java.util.List<edu.grinnell.sandb.Model.Article> getArticlesByCategory(java.lang.String categoryName) {
    if ((categoryName == null) || (categoryName.equals(edu.grinnell.sandb.Services.Implementation.ORMDbClient.ALL))) {
        return getAll();
    }
    com.orm.query.Select<edu.grinnell.sandb.Model.Article> categoryQuery = com.orm.query.Select.from(edu.grinnell.sandb.Model.Article.class).where(com.orm.query.Condition.prop("category").eq(categoryName));
    java.util.List<edu.grinnell.sandb.Model.Article> articles = categoryQuery.list();
    return !(articles == null) ? articles : new java.util.ArrayList();
}