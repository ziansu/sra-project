@java.lang.Override
public java.util.List<org.dataone.annotator.matcher.ConceptItem> getConcepts(java.util.Map<java.lang.String, java.lang.String> queryItems) throws java.lang.Exception {
    java.lang.StringBuffer sb = new java.lang.StringBuffer();
    for (java.lang.String value : queryItems.values()) {
        sb.append(value);
        sb.append(" ");
    }
    return getConcepts(sb.toString());
}