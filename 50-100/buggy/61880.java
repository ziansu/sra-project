private int compareURI(final org.openrdf.model.URI first, final java.lang.Object second) {
    if (second instanceof org.openrdf.model.URI) {
        return first.stringValue().compareTo(((org.openrdf.model.URI) (second)).stringValue());
    }else
        if (second instanceof org.openrdf.model.BNode) {
            return 1;
        }else
            if (second instanceof eu.fbk.knowledgestore.data.Record) {
                return -1;
            }
        
    
    return java.lang.Integer.MAX_VALUE;
}