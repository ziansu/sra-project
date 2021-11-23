public static <T extends org.roda.core.data.v2.index.IsIndexed> java.lang.Long count(final org.roda.core.data.v2.user.RodaUser user, final java.lang.Class<T> classToReturn, final org.roda.core.data.adapter.filter.Filter filter) throws org.roda.core.data.exceptions.AuthorizationDeniedException, org.roda.core.data.exceptions.GenericException, org.roda.core.data.exceptions.RequestNotValidException {
    final org.roda.wui.common.ControllerAssistant controllerAssistant = new org.roda.wui.common.ControllerAssistant() {    };
    controllerAssistant.checkRoles(user, classToReturn);
    final java.lang.Long count = org.roda.wui.api.controllers.BrowserHelper.count(classToReturn, filter, user);
    controllerAssistant.registerAction(user, LOG_ENTRY_STATE.SUCCESS, "class", classToReturn.getSimpleName(), RodaConstants.CONTROLLER_FILTER_PARAM, filter.toString());
    return count;
}