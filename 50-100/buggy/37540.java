protected org.eclipse.rdf4j.model.Model getById(java.lang.String prefix, java.lang.String type, java.lang.String id) {
    java.lang.String url = (!(id.isEmpty())) ? (((prefix + type) + "/") + id) + "#id" : (prefix + type) + "#id";
    return be.belgif.vocab.helpers.QueryHelper.get(repo, be.belgif.vocab.helpers.QueryHelper.asURI(url), type);
}