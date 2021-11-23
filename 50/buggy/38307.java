public org.elasticsearch.action.index.IndexRequest opType(org.elasticsearch.action.index.IndexRequest.OpType opType) {
    this.opType = opType;
    if (opType == (org.elasticsearch.action.index.IndexRequest.OpType.CREATE)) {
        version(Versions.MATCH_DELETED);
        versionType(VersionType.INTERNAL);
    }
    return this;
}