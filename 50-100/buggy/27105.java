public boolean willDataBeLost() {
    for (int index = 0; index < (originalArticles.size()); index++) {
        WeltladenDB.Artikel origArticle = originalArticles.get(index);
        WeltladenDB.Artikel newArticle = getNewArticle(origArticle);
        java.lang.System.out.println(("origArticle: " + origArticle));
        java.lang.System.out.println(("newArticle: " + newArticle));
        if (!(newArticle.equals(origArticle))) {
            java.lang.System.out.println("return true");
            return true;
        }
    }
    java.lang.System.out.println("return false");
    return false;
}