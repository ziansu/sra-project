private java.lang.Object readResolve() {
    if (((this.data) == null) && ((this.json) != null)) {
        this.data = net.sf.json.JSONObject.fromObject(this.json);
    }
    return this;
}