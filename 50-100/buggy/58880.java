public org.flowable.app.model.editor.AppDefinitionUpdateResultRepresentation publishAppDefinition(java.lang.String modelId, org.flowable.app.model.editor.AppDefinitionPublishRepresentation publishModel) {
    org.flowable.idm.api.User user = org.flowable.app.security.SecurityUtils.getCurrentUserObject();
    org.flowable.app.domain.editor.Model appModel = modelService.getModel(modelId);
    org.flowable.app.model.editor.AppDefinitionRepresentation appDefinitionRepresentation = createAppDefinitionRepresentation(appModel);
    org.flowable.app.model.editor.AppDefinitionUpdateResultRepresentation result = new org.flowable.app.model.editor.AppDefinitionUpdateResultRepresentation();
    try {
        appDefinitionPublishService.publishAppDefinition(publishModel.getComment(), appModel, user);
    } catch (java.lang.Exception ex) {
        result.setError(true);
        result.setErrorDescription("Publish app failed");
    }
    result.setAppDefinition(appDefinitionRepresentation);
    return result;
}