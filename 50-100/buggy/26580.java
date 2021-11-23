public org.openrdf.query.Update prepareUpdate(org.openrdf.query.QueryLanguage language, final java.lang.String update, java.lang.String baseURI) throws org.openrdf.query.MalformedQueryException, org.openrdf.repository.RepositoryException {
    if (language != (org.openrdf.query.QueryLanguage.SPARQL))
        throw new org.openrdf.query.UnsupportedQueryLanguageException(" : Only SPARQL queries are supported");
    
    org.openrdf.query.Update u = new virtuoso.sesame2.driver.VirtuosoUpdate() {
        public void execute() throws org.openrdf.query.UpdateExecutionException {
            executeSPARUL(update, getDataset(), getIncludeInferred(), getBindings(), (-1));
        }
    };
    return u;
}