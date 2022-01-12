public java.lang.String getElasticsearchUrl() {
    final java.util.List<java.lang.String> urls = elasticsearchUrls.getValue();
    final int index = (accessesToElasticsearchUrl.getAndIncrement()) % (urls.size());
    return org.stagemonitor.core.util.StringUtils.removeTrailingSlash(urls.get(index));
}