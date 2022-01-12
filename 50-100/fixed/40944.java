private org.eclipse.emf.ecore.resource.Resource getPlatformResource(java.lang.String anaPropertyFile) {
    try {
        org.talend.commons.emf.EMFUtil util = new org.talend.commons.emf.EMFUtil();
        org.eclipse.emf.ecore.resource.ResourceSet resourceSet = util.getResourceSet();
        org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createPlatformPluginURI(("/org.talend.cwm.management.test" + anaPropertyFile), true);
        return resourceSet.getResource(uri, true);
    } catch (java.lang.NullPointerException e) {
        fail(("Can not find the file: " + anaPropertyFile));
        e.printStackTrace();
    }
    return null;
}