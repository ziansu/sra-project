public static org.sosy_lab.cpachecker.cpa.policyiteration.PolicyBound of(org.sosy_lab.cpachecker.util.predicates.pathformula.PathFormula pFormula, org.sosy_lab.common.rationals.Rational bound, org.sosy_lab.cpachecker.cpa.policyiteration.PolicyAbstractedState pUpdatedFrom, java.util.Collection<org.sosy_lab.cpachecker.cpa.policyiteration.Template> pDependencies) {
    return new org.sosy_lab.cpachecker.cpa.policyiteration.PolicyBound(pFormula, bound, pUpdatedFrom, pDependencies, false);
}