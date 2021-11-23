public void removeRule(org.eclipse.incquery.runtime.api.IQuerySpecification<?> spec) {
    org.eclipse.incquery.runtime.evm.api.RuleSpecification<org.eclipse.incquery.runtime.api.IPatternMatch> ruleSpecification = specs.get(spec);
    rules.remove(ruleSpecification);
    specs.remove(spec, ruleSpecification);
    executionSchema.removeRule(ruleSpecification);
}