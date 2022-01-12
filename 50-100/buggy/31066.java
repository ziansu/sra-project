@java.lang.Override
public java.lang.String toJSONString() {
    org.json.JSONArray keyboard = new org.json.JSONArray(this.keyboard);
    org.json.JSONObject object = new org.json.JSONObject();
    object.append("keyboard", keyboard);
    if (resizeKeyboard) {
        object.put("resize_keyboard", true);
    }
    if (oneTimeKeyboard) {
        object.put("one_time_keyboard", true);
    }
    if (selective) {
        object.put("selective", true);
    }
    return object.toString();
}