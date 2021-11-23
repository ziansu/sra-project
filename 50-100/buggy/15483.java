public static <T extends org.roda.core.data.v2.index.IsIndexed> java.util.List<T> retrieve(org.roda.core.data.v2.user.RodaUser user, java.lang.Class<T> classToReturn, org.roda.core.data.v2.index.SelectedItems<T> selectedItems) throws org.roda.core.data.exceptions.AuthorizationDeniedException, org.roda.core.data.exceptions.GenericException, org.roda.core.data.exceptions.NotFoundException, org.roda.core.data.exceptions.RequestNotValidException {
    org.roda.wui.common.ControllerAssistant controllerAssistant = new org.roda.wui.common.ControllerAssistant() {    };
    controllerAssistant.checkRoles(user);
    java.util.List<T> objects = org.roda.wui.api.controllers.BrowserHelper.retrieve(classToReturn, selectedItems);
    controllerAssistant.registerAction(user, LOG_ENTRY_STATE.SUCCESS, "selectedItems", selectedItems);
    return objects;
}