public static void notifyNewAlarm(models.Alarm al) {
    com.fasterxml.jackson.databind.node.ObjectNode wrapper = play.libs.Json.newObject();
    com.fasterxml.jackson.databind.node.ObjectNode action = play.libs.Json.newObject();
    com.fasterxml.jackson.databind.node.ObjectNode alarm = models.Alarm.toJson(al);
    action.put("action", "addAlarm");
    wrapper.put("action", action);
    wrapper.put("alarm", alarm);
    core.MyWebSocketManager.notifyAll(wrapper);
}