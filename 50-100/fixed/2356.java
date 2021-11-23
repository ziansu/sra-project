@java.lang.Override
public void configure(java.lang.String[] parameters) {
    this.parameters = null;
    if (parameters != null) {
        this.parameters = new java.lang.String[parameters.length];
        java.lang.System.arraycopy(parameters, 0, this.parameters, 0, parameters.length);
    }
}