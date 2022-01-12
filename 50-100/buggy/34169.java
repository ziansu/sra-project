public org.openrdf.query.BooleanQuery prepareBooleanQuery(org.openrdf.query.QueryLanguage language, final java.lang.String query, java.lang.String baseURI) throws org.openrdf.query.MalformedQueryException, org.openrdf.repository.RepositoryException {
    if (language != (org.openrdf.query.QueryLanguage.SPARQL))
        throw new org.openrdf.query.UnsupportedQueryLanguageException(" : Only SPARQL queries are supported");
    
    org.openrdf.query.BooleanQuery q = new virtuoso.sesame2.driver.VirtuosoBooleanQuery() {
        public boolean evaluate() throws org.openrdf.query.QueryEvaluationException {
            return executeSPARQLForBooleanResult(query, getDataset(), getIncludeInferred(), getBindings(), getMaxExecutionTime());
        }
    };
    return q;
}