public static <T extends org.roda.core.data.v2.index.IsIndexed> void delete(final org.roda.core.data.v2.user.RodaUser user, final java.lang.Class<T> classToReturn, final org.roda.core.data.v2.index.SelectedItems<T> ids) throws org.roda.core.data.exceptions.AuthorizationDeniedException, org.roda.core.data.exceptions.GenericException, org.roda.core.data.exceptions.NotFoundException, org.roda.core.data.exceptions.RequestNotValidException {
    final org.roda.wui.common.ControllerAssistant controllerAssistant = new org.roda.wui.common.ControllerAssistant() {    };
    controllerAssistant.checkRoles(user, classToReturn);
    org.roda.wui.api.controllers.BrowserHelper.delete(user, classToReturn, ids);
    controllerAssistant.registerAction(user, LOG_ENTRY_STATE.SUCCESS, "class", classToReturn.getSimpleName());
}