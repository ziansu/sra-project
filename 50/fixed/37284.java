org.sosy_lab.cpachecker.cpa.policyiteration.PolicyAbstractedState withNewAbstraction(java.util.Map<org.sosy_lab.cpachecker.util.templates.Template, org.sosy_lab.cpachecker.cpa.policyiteration.PolicyBound> newAbstraction) {
    return new org.sosy_lab.cpachecker.cpa.policyiteration.PolicyAbstractedState(getNode(), newAbstraction, locationID, manager, ssaMap, pointerTargetSet, extraInvariant, generator, sibling, null);
}