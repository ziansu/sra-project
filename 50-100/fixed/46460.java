private void applyDeleteClassComposition() {
    org.eclipse.uml2.uml.Model umlResult = null;
    try {
        umlResult = modelAdapter.applyDeleteComposition(monitoringBaseModel, monitoringBaseModel.getOwnedElements().get(0), monitoringVariantModel, monitoringVariantModel.getOwnedElements().get(0));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}