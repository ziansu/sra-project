@java.lang.Override
public java.util.List<de.citec.sc.query.Instance> getResourcesFromDBpedia(java.lang.String searchTerm, int topK) {
    return dbpediaRetriever.getResources(searchTerm, topK);
}