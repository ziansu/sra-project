public void setEmailServiceHook(java.lang.String address) throws java.io.IOException {
    java.util.Map<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("address", address);
    new org.kohsuke.github.Requester(root).method("POST").with("name", "email").with("config", config).with("active", "true").to(getApiTailUrl("hooks"));
}