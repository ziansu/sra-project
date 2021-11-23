@java.lang.Override
public java.lang.String filter(java.net.URL pageUrl, com.digitalpebble.storm.crawler.Metadata sourceMetadata, java.lang.String url) {
    int depth = getDepth(sourceMetadata);
    if (((maxDepth) > 0) && (depth > (maxDepth))) {
        return null;
    }
    return url;
}