public au.com.newint.newinternationalist.Article getArticleWithID(int articleID) {
    return new au.com.newint.newinternationalist.Article(au.com.newint.newinternationalist.Article.getArticleJsonForId(articleID, this.getID()), this.getID());
}