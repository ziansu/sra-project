protected final int getInt(net.sf.json.JSONObject jo, java.lang.String tag) {
    if (jo.has(tag)) {
        return org.giiwa.core.bean.Bean.toInt(jo.get(tag));
    }
    return this.getInt(tag);
}