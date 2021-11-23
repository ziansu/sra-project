private void handleComposedMember(org.eclipse.emf.ecore.resource.Resource resource, org.eclipse.emf.ecore.EObject from, org.eclipse.xtext.util.IAcceptor<org.apache.commons.lang3.tuple.ImmutablePair<org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject>> acceptor, org.eclipse.n4js.ts.types.TMember to) {
    if (to.isComposed()) {
        for (org.eclipse.n4js.ts.types.TMember constituentMember : to.getConstituentMembers()) {
            handleIdentifiableElement(resource, from, acceptor, constituentMember);
        }
    }else {
        handleIdentifiableElement(resource, from, acceptor, to);
    }
}