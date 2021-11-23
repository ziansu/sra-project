public void setField(java.lang.String solr_property, java.lang.String value) {
    if (value != null)
        doc.setField(solr_property, sanitizeString(solr_property, value));
    
}