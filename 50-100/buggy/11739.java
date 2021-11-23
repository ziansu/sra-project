public void setProperties(java.util.Map<java.lang.String, java.lang.Object> properties) {
    for (java.lang.Object o : properties.values()) {
        if ((!(o instanceof java.lang.String)) && (!(o instanceof java.lang.Double))) {
            throw new java.lang.IllegalArgumentException("Values must be Strings or Doubles.");
        }
    }
    this.properties = properties;
}