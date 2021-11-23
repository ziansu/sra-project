public java.util.Set<de.uka.ipd.sdq.beagle.core.evaluableexpressions.EvaluableExpression> getProposedExpressionFor(final de.uka.ipd.sdq.beagle.core.MeasurableSeffElement element) {
    org.apache.commons.lang3.Validate.notNull(element);
    org.apache.commons.lang3.Validate.isTrue(this.allSeffElements.contains(element), "element must already be on the blackboard");
    return this.proposedExpressions.get(element);
}