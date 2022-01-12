@java.lang.Override
public void writeToJSON(org.json.JSONObject json) {
    proto.writeToJSON(json);
    json.put("subtype", json.getString("type"));
    json.put("type", "NodeGroupRect");
    json.remove("x");
    json.remove("y");
    json.put("x1", y);
    json.put("y1", x);
    json.put("x2", y2);
    json.put("y2", x2);
}