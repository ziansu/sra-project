private java.lang.String getUrl(java.lang.String[] indices, java.lang.String[] types) {
    final java.lang.String inds = (indices == null) ? null : com.google.common.base.Joiner.on(",").join(indices);
    final java.lang.String typs = (types == null) ? null : com.google.common.base.Joiner.on(",").join(types);
    return getUrl(inds, typs, null);
}