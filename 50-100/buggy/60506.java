@java.lang.Override
public java.lang.String filter(java.net.URL pageUrl, com.digitalpebble.stormcrawler.Metadata sourceMetadata, java.lang.String url) {
    int depth = getDepth(sourceMetadata, MetadataTransfer.depthKeyName);
    int customMax = getDepth(sourceMetadata, MetadataTransfer.maxDepthKeyName);
    if (customMax >= 0) {
        return filter(depth, customMax, url);
    }else
        if ((maxDepth) >= 0) {
            return null;
        }
    
    return url;
}