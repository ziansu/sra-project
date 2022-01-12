public java.util.List<java.lang.String> getPropConfiguration(java.lang.String lblProps) throws java.io.IOException {
    java.util.List<java.lang.String> items = null;
    try {
        if ((this.props) == null) {
            loadPropFile();
        }
        java.util.List<java.lang.String> rtrn = java.util.Arrays.asList(this.props.getProperty(lblProps).split("\\s*,\\s*"));
        return rtrn;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}