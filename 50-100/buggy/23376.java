protected final int getInt(net.sf.json.JSONObject jo, java.lang.String tag, int minValue, java.lang.String tagInSession) {
    if (jo.has(tag)) {
        int i = org.giiwa.core.bean.Bean.toInt(jo.get(tag));
        if (i >= minValue) {
            return i;
        }
    }
    return this.getInt(tag, minValue, tagInSession);
}