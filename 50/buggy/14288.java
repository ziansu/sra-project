org.sosy_lab.cpachecker.cpa.policyiteration.PolicyAbstractedState withNewSSA(org.sosy_lab.cpachecker.util.predicates.pathformula.SSAMap pSsaMap) {
    return new org.sosy_lab.cpachecker.cpa.policyiteration.PolicyAbstractedState(getNode(), abstraction, locationID, manager, pSsaMap, pointerTargetSet, extraInvariant, generator, sibling);
}