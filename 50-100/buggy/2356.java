@java.lang.Override
public void configure(java.lang.String[] parameters) {
    if (parameters != null) {
        this.parameters = new java.lang.String[parameters.length];
        java.lang.System.arraycopy(parameters, 0, this.parameters, 0, parameters.length);
    }
}