private void processChildren(java.util.List<de.ibm.issw.requestmetrics.model.RMNode> children, java.util.LinkedHashMap<java.lang.String, de.ibm.issw.requestmetrics.model.RMNode> uniqueUris) {
    if (children != null) {
        for (de.ibm.issw.requestmetrics.model.RMNode child : children) {
            if ("URI".equals(child.rmData.getTypeCmp())) {
                java.lang.String key = child.rmData.getDetailCmp();
                if (!(uniqueUris.containsKey(key))) {
                    uniqueUris.put(key, child);
                }
            }
            processChildren(child.children, uniqueUris);
        }
    }
}