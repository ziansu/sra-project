com.google.common.base.Optional<nz.bradcampbell.paperparcel.AdapterGraph> getGraph(com.squareup.javapoet.TypeName normalizedType) {
    return com.google.common.base.Optional.fromNullable(graphs.get(normalizedType));
}