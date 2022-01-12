public void setExtraProperties(java.util.Properties extraProperties) {
    for (java.lang.String key : this.getParameterMap().keySet()) {
        org.teiid.datatools.connectivity.model.Parameter para = this.getParameterMap().get(key);
        this.extraProperties.put(para.getPropertyKey(), para.getPropertyValue());
    }
    this.extraProperties = extraProperties;
}