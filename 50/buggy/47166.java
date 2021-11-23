@org.springframework.web.bind.annotation.RequestMapping(value = "/alert", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void notifyAlert(@org.springframework.web.bind.annotation.RequestBody
eu.supersede.integration.api.dm.types.Alert alert) {
    log.debug(("Alert received: " + alert));
    notificationUtil.createNotificationsForProfile("DECISION_SCOPE_PROVIDER", alert.getMessage(), "");
    return ;
}