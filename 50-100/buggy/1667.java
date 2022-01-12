private java.lang.String getFusekiSparqlEndpointUrl(java.lang.String company) {
    java.lang.String FUSEKI_SPARQL_ENDPOINT_URL;
    if (company.equals(this.FUSEKI_DATASET_HELLA))
        FUSEKI_SPARQL_ENDPOINT_URL = this.FUSEKI_SPARQL_ENDPOINT_HELLA;
    else
        if (company.equals(this.FUSEKI_DATASET_MHWIRTH))
            FUSEKI_SPARQL_ENDPOINT_URL = this.FUSEKI_SPARQL_ENDPOINT_MHWIRTH;
        else
            FUSEKI_SPARQL_ENDPOINT_URL = this.FUSEKI_SPARQL_ENDPOINT_DEFAULT;
        
    
    return FUSEKI_SPARQL_ENDPOINT_URL;
}