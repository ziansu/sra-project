public java.lang.Boolean getBoolean(java.lang.String section, java.lang.String key) throws java.io.IOException {
    java.lang.String value = getString(section, key);
    if ((value.toLowerCase().equals("true")) || (value.equals("1"))) {
        return true;
    }else
        if ((value.toLowerCase().equals("false")) || (value.equals("0"))) {
            return false;
        }else {
            throw new java.io.IOException(("Invalid boolean format: " + value));
        }
    
}