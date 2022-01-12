private com.google.common.collect.ImmutableList<com.spectralogic.ds3autogen.api.models.Ds3Param> toDs3Params(final java.util.List<com.spectralogic.d3autogen.models.xml.Param> params) {
    if (params == null) {
        return null;
    }
    java.lang.System.out.println((("toDs3Params[" + (params.size())) + "]"));
    final com.google.common.collect.ImmutableList.Builder<com.spectralogic.ds3autogen.api.models.Ds3Param> ds3ParamsBuilder = com.google.common.collect.ImmutableList.builder();
    for (final com.spectralogic.d3autogen.models.xml.Param param : params) {
        ds3ParamsBuilder.add(param.toDs3Param());
    }
    return ds3ParamsBuilder.build();
}