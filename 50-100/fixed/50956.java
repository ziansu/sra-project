@java.lang.Deprecated
public void notifyFollowUpAlarm(long alarmId) {
    com.fasterxml.jackson.databind.node.ObjectNode jsonNotification = play.libs.Json.newObject();
    com.fasterxml.jackson.databind.node.ObjectNode action = play.libs.Json.newObject();
    jsonNotification.put("action", action);
    action.put("action", "notifyFollowup");
    jsonNotification.put("alarmId", alarmId);
    notifyAll(jsonNotification);
}