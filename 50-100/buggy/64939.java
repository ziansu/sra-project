private static org.semanticweb.ontop.pivotalrepr.impl.ConstructionNode createProjectionNodeWithoutModifier(org.semanticweb.ontop.pivotalrepr.impl.CQIE datalogRule) throws org.semanticweb.ontop.pivotalrepr.impl.Datalog2IntermediateQueryConverter.InvalidDatalogProgramException {
    final boolean allowVariableCreation = true;
    fj.P2<org.semanticweb.ontop.pivotalrepr.impl.DataAtom, org.semanticweb.ontop.pivotalrepr.impl.ImmutableSubstitution<org.semanticweb.ontop.pivotalrepr.impl.ImmutableTerm>> decomposition = org.semanticweb.ontop.pivotalrepr.impl.Datalog2IntermediateQueryConverter.convertFromDatalogDataAtom(datalogRule.getHead(), allowVariableCreation);
    return new org.semanticweb.ontop.pivotalrepr.impl.ConstructionNodeImpl(decomposition._1(), decomposition._2());
}