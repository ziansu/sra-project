private com.b2international.snowowl.datastore.delta.HierarchicalComponentDelta createDelta(final java.lang.String conceptId, final long cdoId, final com.b2international.commons.ChangeKind change, final org.eclipse.emf.cdo.view.CDOView view) {
    final java.lang.String label = getConceptLabel(conceptId, view);
    short terminologyComponentId = getTerminologyComponentId();
    java.lang.String iconId = new com.b2international.snowowl.snomed.datastore.SnomedConceptIconIdProvider().getIconId(com.b2international.snowowl.datastore.BranchPointUtils.create(view), conceptId);
    return new com.b2international.snowowl.datastore.delta.HierarchicalComponentDelta(conceptId, cdoId, getBranchPath(), label, (iconId != null ? iconId : conceptId), terminologyComponentId, getCodeSystemOID(terminologyComponentId), change);
}