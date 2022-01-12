@java.lang.Override
public java.util.List<org.eclipse.osee.framework.core.data.ApplicabilityToken> getViewApplicabilityTokens(org.eclipse.osee.framework.core.data.ArtifactId artId, org.eclipse.osee.framework.core.data.BranchId branch) {
    java.util.List<org.eclipse.osee.framework.core.data.ApplicabilityToken> result = new java.util.ArrayList<>();
    java.util.function.BiConsumer<java.lang.Long, java.lang.String> consumer = ( id, name) -> result.add(new org.eclipse.osee.framework.core.data.ApplicabilityToken(id, name));
    tupleQuery.getTuple2KeyValuePair(CoreTupleTypes.ViewApplicability, artId, branch, consumer);
    return result;
}