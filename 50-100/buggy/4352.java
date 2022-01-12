@java.lang.Override
public void updateContentUrl(org.alfresco.repo.domain.contentdata.ContentUrlEntity contentUrl) {
    if (contentUrl == null) {
        throw new java.lang.IllegalArgumentException("Cannot look up ContentData by null ID.");
    }
    org.alfresco.util.Pair<java.lang.Long, org.alfresco.repo.domain.contentdata.ContentUrlEntity> pair = contentUrlCache.getByValue(contentUrl);
    if (pair != null) {
        contentUrlCache.updateValue(pair.getFirst(), contentUrl);
    }else {
        pair = contentUrlCache.getOrCreateByValue(contentUrl);
        contentUrlCache.updateValue(pair.getFirst(), contentUrl);
    }
}