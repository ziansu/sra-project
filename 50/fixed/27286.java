public java.lang.String getCsmServerName() {
    if ((server_name) == null)
        return new java.lang.String();
    
    return new java.lang.String(server_name, java.nio.charset.Charset.forName("UTF-8"));
}