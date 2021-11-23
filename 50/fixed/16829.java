private com.google.common.collect.FluentIterable<org.sosy_lab.cpachecker.util.states.MemoryLocation> getMemoryLocationsFromUseDefRelation() {
    org.sosy_lab.cpachecker.util.refinement.UseDefRelation useDefRelation = new org.sosy_lab.cpachecker.util.refinement.UseDefRelation(foundPath, java.util.Collections.<java.lang.String>emptySet(), false);
    return com.google.common.collect.FluentIterable.from(useDefRelation.getUsesAsQualifiedName()).transform(MemoryLocation.FROM_STRING_TO_MEMORYLOCATION);
}