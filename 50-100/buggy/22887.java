private boolean closEquals(java.util.List<com.chicootec.dbcomparator.MetadataColumn> src, java.util.List<com.chicootec.dbcomparator.MetadataColumn> dest) {
    if ((src.size()) != (dest.size())) {
        return false;
    }
    for (com.chicootec.dbcomparator.MetadataColumn cm : src) {
        if (!(dest.contains(cm))) {
            return false;
        }
    }
    return true;
}