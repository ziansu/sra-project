public boolean apply(org.eclipse.xtext.resource.IEObjectDescription input) {
    if (org.yakindu.sct.model.stext.scoping.STextGlobalScopeProvider.FILE_EXTENSION.equals(input.getEObjectURI().fileExtension())) {
        org.eclipse.emf.common.util.URI sourceURI = input.getEObjectURI().trimFragment();
        return sourceURI.equals(resourceURI);
    }
    return true;
}