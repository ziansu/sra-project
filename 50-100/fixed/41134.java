@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    hr.math.android.topthema.articles.TopThemaArticle article = articlesOnScreen.get(((int) (id)));
    if (article.isStripped()) {
        new hr.math.android.topthema.web.DownloadArticleTask(this).execute(article);
    }else {
        startSecondActivity(article);
    }
}