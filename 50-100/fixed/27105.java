public boolean willDataBeLost() {
    for (int index = 0; index < (originalArticles.size()); index++) {
        WeltladenDB.Artikel origArticle = originalArticles.get(index);
        WeltladenDB.Artikel newArticle = getNewArticle(origArticle);
        if (!(newArticle.equals(origArticle))) {
            return true;
        }
    }
    return false;
}