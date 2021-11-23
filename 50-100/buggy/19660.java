@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o.getClass()) == (com.feeder.model.Article.class)) {
        com.feeder.model.Article article = ((com.feeder.model.Article) (o));
        return (com.feeder.common.StringUtil.equals(article.getTitle(), getTitle())) && (com.feeder.common.NumberUtil.equals(article.getSubscriptionId(), subscriptionId));
    }
    return false;
}