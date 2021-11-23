@java.lang.SuppressWarnings(value = "unchecked")
public final org.json.simple.JSONArray getJSONData() {
    org.json.simple.JSONArray masterArray = new org.json.simple.JSONArray();
    for (com.sb.elsinore.triggers.TriggerInterface e : triggerList) {
        masterArray.add(e.getJSONStatus());
    }
    return masterArray;
}