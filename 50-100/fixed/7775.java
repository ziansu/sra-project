void setTerms(java.util.List<java.lang.String> terms) {
    if (org.apache.commons.collections.CollectionUtils.isEmpty(terms))
        return ;
    
    java.lang.StringBuffer text = new java.lang.StringBuffer();
    java.util.Iterator<java.lang.String> i = terms.iterator();
    while (i.hasNext()) {
        text.append(i.next());
        if (i.hasNext())
            text.append(SearchUtil.SPACE_SEPARATOR);
        
    } 
    fullTextArea.setText(text.toString());
}