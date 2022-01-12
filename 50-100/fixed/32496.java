public T withName(java.lang.String name) {
    this.name = name;
    properties.setProperty(org.apache.geode.distributed.ConfigurationProperties.NAME, name);
    properties.putIfAbsent(org.apache.geode.distributed.ConfigurationProperties.LOG_FILE, new java.io.File((name + ".log")).getAbsolutePath());
    return ((T) (this));
}