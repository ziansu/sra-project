@java.lang.Deprecated
public void notifyCloseAlarm(models.Alarm al) {
    com.fasterxml.jackson.databind.node.ObjectNode jsonNotification = play.libs.Json.newObject();
    com.fasterxml.jackson.databind.node.ObjectNode action = play.libs.Json.newObject();
    jsonNotification.put("action", action);
    action.put("action", "removeAlarm");
    jsonNotification.put("alarmId", al.id);
    notifyAll(jsonNotification);
}