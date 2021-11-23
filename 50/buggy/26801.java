public java.lang.Iterable<org.linqs.psl.model.rule.UnweightedGroundRule> getConstraintKernels() {
    return com.google.common.collect.Iterables.filter(groundKernels.filterIterable(Filters.ConstraintKernel), org.linqs.psl.model.rule.UnweightedGroundRule.class);
}