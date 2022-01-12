protected void basicRemoveRelation(R rel) {
    getIndexMgr().removeValue(rel);
    getIndexMgr().remove(SaltUtil.IDX_ID_RELATIONS_INVERSE, rel);
    for (org.corpus_tools.salt.graph.Layer<N, R> layer : layers) {
        layer.removeRelation(rel);
    }
    relations.remove(rel);
}