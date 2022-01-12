public static java.util.Set<java.lang.String> getEffectiveConsumes(com.flipkart.databuilderframework.model.DataBuilderMeta builderMeta) {
    if ((null == (builderMeta.getOptionals())) || (builderMeta.getOptionals().isEmpty())) {
        return builderMeta.getConsumes();
    }else {
        return com.google.common.collect.Sets.union(builderMeta.getConsumes(), builderMeta.getOptionals());
    }
}