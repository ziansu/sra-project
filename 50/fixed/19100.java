public java.util.List<com.uci.mode.IndexEntry> getIndexEntities(java.lang.String term) {
    java.util.List<com.uci.mode.IndexEntry> termPoses = indexMap.get(term);
    return termPoses == null ? new java.util.ArrayList<>() : termPoses;
}