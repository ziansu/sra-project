protected final net.sf.json.JSONObject getJSON() {
    if ((req) instanceof com.giisoo.framework.web.MDCHttpRequest) {
        return ((com.giisoo.framework.web.MDCHttpRequest) (req)).getJSON();
    }else {
        net.sf.json.JSONObject jo = new net.sf.json.JSONObject();
        for (java.lang.String name : this.getNames()) {
            java.lang.String s = this.getString(name);
            jo.put(name, s);
        }
        return jo;
    }
}