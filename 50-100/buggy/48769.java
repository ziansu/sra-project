protected final net.sf.json.JSONObject getJSON() {
    if ((_json) == null) {
        _json = new net.sf.json.JSONObject();
        for (java.lang.String name : this.getNames()) {
            java.lang.String s = this.getString(name);
            _json.put(name, s);
        }
    }
    return _json;
}