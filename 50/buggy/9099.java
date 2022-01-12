private java.lang.String getUserValue(com.mls.kicker.reservation.engine.StateChangedEvent event) {
    java.lang.String userName = slack.getUserNameByUserId(event.getUserId());
    java.lang.String userValue = ("???".equals(userName)) ? "You" : userName;
    return userValue;
}