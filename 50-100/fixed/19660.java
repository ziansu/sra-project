@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if (o instanceof com.feeder.model.Article) {
        com.feeder.model.Article article = ((com.feeder.model.Article) (o));
        return (com.feeder.common.StringUtil.equals(article.getTitle(), getTitle())) && (com.feeder.common.NumberUtil.equals(article.getSubscriptionId(), subscriptionId));
    }
    return false;
}