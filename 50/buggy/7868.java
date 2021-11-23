@java.lang.Override
public org.json.JSONObject getNextData() throws java.lang.Exception {
    java.lang.System.out.println(("get event from:" + (events)));
    return events.poll();
}