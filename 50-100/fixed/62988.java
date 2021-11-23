@java.lang.Deprecated
public void notifyFinishedAlarm(models.Alarm a) {
    com.fasterxml.jackson.databind.node.ObjectNode wrapper = play.libs.Json.newObject();
    com.fasterxml.jackson.databind.node.ObjectNode alarmJson = models.Alarm.toJson(a);
    com.fasterxml.jackson.databind.node.ObjectNode action = play.libs.Json.newObject();
    wrapper.put("action", action);
    action.put("action", "finishedAlarm");
    wrapper.put("alarm", alarmJson);
    notifyAll(wrapper);
}