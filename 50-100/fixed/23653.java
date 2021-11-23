private java.lang.String parseMember(int[][] set, int end) throws java.net.URISyntaxException {
    int start = pos;
    while (true) {
        int chr = peek();
        if ((chr == (org.eclipse.rdf4j.common.net.ParsedIRI.EOF)) || (chr == end)) {
            break;
        }else
            if (isMember(set, chr)) {
                advance(1);
            }else {
                break;
            }
        
    } 
    return iri.substring(start, pos);
}