public java.util.Properties getExtraProperties() {
    for (java.lang.String key : this.getParameterMap().keySet()) {
        org.teiid.datatools.connectivity.model.Parameter para = this.getParameterMap().get(key);
        this.extraProperties.put(para.getPropertyKey(), para.getPropertyValue());
    }
    return this.extraProperties;
}