public java.lang.Iterable<org.linqs.psl.model.rule.UnweightedGroundRule> getConstraintKernels() {
    return com.google.common.collect.Iterables.filter(groundKernels.values(), org.linqs.psl.model.rule.UnweightedGroundRule.class);
}