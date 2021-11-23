@java.lang.Override
public void add(com.app.meenabazaar.meenabazaar.model.Article article_detail) {
    super.add(article_detail);
    articles.add(article_detail);
    notifyUpdate();
    notifyDataSetChanged();
}