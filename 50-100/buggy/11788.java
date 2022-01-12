public static void addTimeIconToAlarm(long id) {
    com.fasterxml.jackson.databind.node.ObjectNode jsonNotification = play.libs.Json.newObject();
    com.fasterxml.jackson.databind.node.ObjectNode action = play.libs.Json.newObject();
    jsonNotification.put("action", action);
    action.put("action", "addTimeNotification");
    jsonNotification.put("alarmId", id);
    core.MyWebSocketManager.notifyAll(jsonNotification);
}