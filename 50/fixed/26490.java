@org.apache.unomi.rest.GET
@org.apache.unomi.rest.Path(value = "/actions/{actionId}")
public org.apache.unomi.rest.RESTActionType getActionType(@org.apache.unomi.rest.PathParam(value = "actionId")
java.lang.String id, @org.apache.unomi.rest.HeaderParam(value = "Accept-Language")
java.lang.String language) {
    org.apache.unomi.api.actions.ActionType actionType = definitionsService.getActionType(id);
    return actionType != null ? localizationHelper.generateAction(actionType, language) : null;
}