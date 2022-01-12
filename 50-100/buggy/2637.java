public java.lang.Boolean getBoolean(java.lang.String section, java.lang.String key) throws java.io.IOException {
    java.lang.String value = getString(section, key);
    if (((value.toLowerCase()) == "true") || (value == "1")) {
        return true;
    }else
        if (((value.toLowerCase()) == "false") || (value == "0")) {
            return false;
        }else {
            throw new java.io.IOException(("Invalid boolean format: " + value));
        }
    
}