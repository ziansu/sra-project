public java.util.Properties getExtraProperties() {
    this.extraProperties = new java.util.Properties();
    for (java.lang.String key : this.getParameterMap().keySet()) {
        org.teiid.datatools.connectivity.model.Parameter para = this.getParameterMap().get(key);
        this.extraProperties.put(para.getPropertyKey(), para.getPropertyValue());
    }
    return this.extraProperties;
}