@java.lang.Override
public java.lang.String toString() {
    org.json.JSONObject obj = new org.json.JSONObject();
    try {
        obj.put("id", _id);
        obj.put("date", com.webteam.wbgapp.wbgapp.util.Util.getTStampFromDate(_date.getTime()).getTime());
        obj.put("headline", com.webteam.wbgapp.wbgapp.util.Util.escUnicode(_title));
        obj.put("content", com.webteam.wbgapp.wbgapp.util.Util.escUnicode(_content));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return obj.toString();
}