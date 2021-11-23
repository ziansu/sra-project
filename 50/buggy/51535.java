@java.lang.Override
public java.lang.String convertFrom(java.lang.String source, ma.glasnost.orika.metadata.Type<java.lang.String> destinationType) {
    if (source.equals("GRANT_NUMBER"))
        return "grant_number";
    
    return source.toLowerCase().replace("_", "-");
}