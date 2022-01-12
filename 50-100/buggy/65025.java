public void writeArticleToDataStore(ru.brandanalyst.core.model.Article article) {
    try {
        jdbcTemplate.update("INSERT INTO Article (InfoSourceId, BrandId, Title, Content, Link, NumLikes, Tstamp) VALUES(?, ?, ?, ?, ?, ?, ?);", article.getBrandId(), article.getSourceId(), article.getTitle(), article.getContent(), article.getLink(), article.getNumLikes(), article.getTstamp());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}