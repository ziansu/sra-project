public boolean apply(org.eclipse.xtext.resource.IEObjectDescription input) {
    if (input.getEObjectURI().fileExtension().equals(org.yakindu.sct.model.stext.scoping.STextGlobalScopeProvider.FILE_EXTENSION)) {
        org.eclipse.emf.common.util.URI sourceURI = input.getEObjectURI().trimFragment();
        return sourceURI.equals(resourceURI);
    }
    return true;
}