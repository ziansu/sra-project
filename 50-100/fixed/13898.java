public org.elasticsearch.action.index.IndexRequest opType(org.elasticsearch.action.index.OpType opType) {
    if ((opType != (OpType.CREATE)) && (opType != (OpType.INDEX))) {
        throw new java.lang.IllegalArgumentException((("opType must be 'create' or 'index', found: [" + opType) + "]"));
    }
    this.opType = opType;
    return this;
}