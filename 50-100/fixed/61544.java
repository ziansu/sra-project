public java.lang.String getElasticsearchUrl() {
    final java.util.List<java.lang.String> urls = elasticsearchUrls.getValue();
    if (urls.isEmpty()) {
        return null;
    }
    final int index = (accessesToElasticsearchUrl.getAndIncrement()) % (urls.size());
    return org.stagemonitor.core.util.StringUtils.removeTrailingSlash(urls.get(index));
}