private java.lang.String normalize(java.lang.String s) {
    if ((s != null) && (s.matches("[0-9]+|[0-9]+\\.[0-9]+|[0-9]+[0-9,]+")))
        return "<num>";
    
    return s;
}