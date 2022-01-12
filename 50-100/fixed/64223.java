private jetbrains.mps.openapi.actions.descriptor.PasteWrapper getPasteWrapper(org.jetbrains.mps.openapi.language.SAbstractConcept source, org.jetbrains.mps.openapi.language.SAbstractConcept target) {
    buildCache();
    java.util.Map<org.jetbrains.mps.openapi.language.SAbstractConcept, jetbrains.mps.openapi.actions.descriptor.PasteWrapper> wrappers = jetbrains.mps.internal.collections.runtime.MapSequence.fromMap(myPasteWrappers).get(target);
    for (org.jetbrains.mps.openapi.language.SAbstractConcept src : jetbrains.mps.internal.collections.runtime.ListSequence.fromList(jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations.getAllSuperConcepts(source, true))) {
        jetbrains.mps.openapi.actions.descriptor.PasteWrapper pasteWrapper = jetbrains.mps.internal.collections.runtime.MapSequence.fromMap(wrappers).get(src);
        if (pasteWrapper != null) {
            return pasteWrapper;
        }
    }
    return null;
}