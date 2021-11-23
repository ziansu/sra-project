private void applyDeleteClassComposition() {
    org.eclipse.uml2.uml.Model umlResult = null;
    try {
        umlResult = modelAdapter.applyDeleteComposition(monitoringBaseModel, monitoringBaseModel.getOwnedElements().get(0), monitoringVariantModel, monitoringVariantModel.getOwnedElements().get(0));
        save(umlResult, org.eclipse.emf.common.util.URI.createURI(monitoringBasePath));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}