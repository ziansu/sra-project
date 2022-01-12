public void setNamedParams(java.util.Map<java.lang.String, java.lang.Object> namedParams) {
    this.namedParams = namedParams;
    if (namedParams != null) {
        setPositionalParams(null);
    }
}