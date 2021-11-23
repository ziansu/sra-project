public pages.ArticlePage editArticleBySaveAndClose(pages.Article article) {
    enterValueInToCreateArticleForm(article);
    click(BTN_SAVEANDCLOSE);
    return new pages.ArticlePage(driver);
}