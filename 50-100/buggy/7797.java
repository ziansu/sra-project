@java.lang.Override
public void removeSavedArticle(com.rocdev.guardianreader.models.Article article) {
    if ((currentSection) == (Section.SAVED.ordinal())) {
        for (com.rocdev.guardianreader.models.Article a : articles) {
            if (a.equals(article)) {
                articles.remove(a);
                break;
            }
        }
        if (articles.isEmpty()) {
            articlesFragment.showNoSavedArticlesContainer(true);
        }
        articlesFragment.notifyArticlesChanged(true, true);
    }
}