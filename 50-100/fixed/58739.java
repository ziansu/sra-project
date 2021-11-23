private static com.marklogic.semantics.rdf4j.Resource[] mergeResource(com.marklogic.semantics.rdf4j.Resource o, com.marklogic.semantics.rdf4j.Resource... arr) {
    if ((arr != null) && ((arr.length) > 0)) {
        return arr;
    }else
        if (o == null) {
            return null;
        }else {
            com.marklogic.semantics.rdf4j.Resource[] newArray = new com.marklogic.semantics.rdf4j.Resource[1];
            newArray[0] = o;
            return newArray;
        }
    
}