@cz.cesnet.shongo.client.web.controllers.RequestMapping(value = cz.cesnet.shongo.client.web.ClientWebUrl.USER_SETTINGS_WEB_SERVICE_DATA, method = RequestMethod.GET)
@cz.cesnet.shongo.client.web.controllers.ResponseBody
public java.util.Map<java.lang.String, java.lang.Object> handleUserList(cz.cesnet.shongo.controller.api.SecurityToken securityToken) {
    cz.cesnet.shongo.controller.api.UserSettings userSettings = authorizationService.getUserSettings(securityToken, true);
    java.util.Map<java.lang.String, java.lang.Object> result = new java.util.HashMap<java.lang.String, java.lang.Object>();
    result.put("locale", userSettings.getLocale());
    if ((userSettings.getHomeTimeZone()) != null) {
        result.put("homeTimeZone", userSettings.getHomeTimeZone().getID());
    }
    return result;
}