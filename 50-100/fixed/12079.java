com.pixelmed.anatproc.CodedConcept str2cc(java.lang.String s) {
    if (s == null)
        return null;
    
    s = s.replace("(", "").replace(")", "");
    java.lang.String[] str = s.split(";");
    return new com.pixelmed.anatproc.CodedConcept(null, null, str[1], null, null, str[0], str[2], null, null);
}