@java.lang.Override
public java.util.List<model.Article> getArticles() {
    initBean();
    return bean.getAllArticles();
}