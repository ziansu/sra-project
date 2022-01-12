private int compareBNode(final org.openrdf.model.BNode first, final java.lang.Object second) {
    if (second instanceof org.openrdf.model.BNode) {
        return first.getID().compareTo(((org.openrdf.model.BNode) (second)).getID());
    }else
        if ((second instanceof org.openrdf.model.URI) || (second instanceof eu.fbk.knowledgestore.data.Record)) {
            return -1;
        }
    
    return java.lang.Integer.MAX_VALUE;
}