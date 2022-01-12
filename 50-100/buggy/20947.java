public gov.cdc.mmwrexpress.Article deleteArticle(gov.cdc.mmwrexpress.Article article) {
    android.util.Log.d("Remove article: ", ("Title: " + (article.getTitle())));
    gov.cdc.mmwrexpress.Issue issue = article.getIssue();
    article.removeFromRealm();
    removeUnusedKeywords();
    removeUnusedIssue(issue);
    return null;
}