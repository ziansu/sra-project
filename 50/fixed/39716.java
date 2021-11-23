public void cleanUp(java.lang.String fileType) throws java.io.IOException {
    org.eclipse.emf.ecore.resource.Resource resourceOutput = resourceHandler.getResourceFrom((((fileName) + ".") + fileType), true);
    resourceOutput.delete(java.util.Collections.EMPTY_MAP);
}