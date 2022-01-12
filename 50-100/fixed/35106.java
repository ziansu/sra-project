private static void resetR(org.apache.kylin.common.persistence.ResourceStore store, java.lang.String path) throws java.io.IOException {
    java.util.ArrayList<java.lang.String> children = store.listResources(path);
    if (children == null) {
        if (org.apache.kylin.common.persistence.ResourceTool.matchFilter(path)) {
            store.deleteResource(path);
        }
    }else {
        for (java.lang.String child : children)
            org.apache.kylin.common.persistence.ResourceTool.resetR(store, child);
        
    }
}