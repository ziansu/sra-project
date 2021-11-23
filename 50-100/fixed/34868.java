private java.lang.String chooseSendPrompt(java.lang.String eventUid, za.org.grassroot.webapp.controller.ussd.User user) {
    if (!(eventMonthlyLimitActive)) {
        return getMessage(za.org.grassroot.webapp.controller.ussd.USSDMeetingController.thisSection, za.org.grassroot.webapp.controller.ussd.USSDMeetingController.send, promptKey, user);
    }else {
        int numberEventsLeft = accountGroupBroker.numberEventsLeftForParent(eventUid);
        return numberEventsLeft < (za.org.grassroot.webapp.controller.ussd.USSDMeetingController.EVENT_LIMIT_WARNING_THRESHOLD) ? getMessage(za.org.grassroot.webapp.controller.ussd.USSDMeetingController.thisSection, za.org.grassroot.webapp.controller.ussd.USSDMeetingController.send, ((promptKey) + ".limit"), java.lang.String.valueOf(numberEventsLeft), user) : getMessage(za.org.grassroot.webapp.controller.ussd.USSDMeetingController.thisSection, za.org.grassroot.webapp.controller.ussd.USSDMeetingController.send, promptKey, user);
    }
}