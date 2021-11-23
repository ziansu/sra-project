public void setConfig(java.util.HashMap<java.lang.String, java.lang.Object> config) {
    if (config == null) {
        return ;
    }
    this.config = config;
    java.lang.Boolean debug = ((java.lang.Boolean) (this.config.get("debug")));
    if (debug != null) {
        this.DEBUG = debug;
    }
}