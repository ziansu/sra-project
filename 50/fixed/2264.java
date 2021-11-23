private void setKeyStroke(java.util.Properties p, java.lang.String property, java.lang.String key) {
    java.lang.String value = p.getProperty(property);
    if (value != null) {
        this.putValue(key, javax.swing.KeyStroke.getKeyStroke(value));
    }
}