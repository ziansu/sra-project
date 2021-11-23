private static com.marklogic.semantics.rdf4j.Resource[] mergeResource(com.marklogic.semantics.rdf4j.Resource o, com.marklogic.semantics.rdf4j.Resource... arr) {
    if (o != null) {
        com.marklogic.semantics.rdf4j.Resource[] newArray = new com.marklogic.semantics.rdf4j.Resource[(arr.length) + 1];
        newArray[0] = o;
        java.lang.System.arraycopy(arr, 0, newArray, 1, arr.length);
        return newArray;
    }else {
        return arr;
    }
}