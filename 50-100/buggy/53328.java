public com.google.common.util.concurrent.ListenableFuture<se.tre.freki.meta.LabelMeta> getLabelMeta(final se.tre.freki.labels.LabelType type, final se.tre.freki.labels.LabelId uid) {
    return com.google.common.util.concurrent.Futures.transform(labelClient.getLabelName(type, uid), new com.google.common.util.concurrent.AsyncFunction<java.lang.String, se.tre.freki.meta.LabelMeta>() {
        @java.lang.Override
        public com.google.common.util.concurrent.ListenableFuture<se.tre.freki.meta.LabelMeta> apply(final java.lang.String name) throws java.lang.Exception {
            return store.getMeta(uid, type);
        }
    });
}