private boolean canGenerateRangeQuery(boolean isUniqueIndex, java.util.List<net.royqh.easypersist.generator.SingleProperty> indexProperties) {
    if (isUniqueIndex) {
        for (net.royqh.easypersist.generator.SingleProperty singleProperty : indexProperties) {
            if (net.royqh.easypersist.utils.TypeUtils.isRangeTypeProperty(singleProperty)) {
                return true;
            }
        }
        return false;
    }
    return true;
}