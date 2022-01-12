public static java.util.List<java.lang.String> retrieveEntities(java.lang.String endpoint, java.lang.String uri, java.lang.String language) {
    java.util.List<java.lang.String> entities = new java.util.ArrayList<java.lang.String>();
    entities.addAll(de.citec.sc.sentence.preprocessing.sparql.Sparql.getValues(endpoint, de.citec.sc.sentence.preprocessing.sparql.Sparql.getQueryLabel(language, uri), language, uri));
    if ((entities.size()) == 0) {
        entities.addAll(de.citec.sc.sentence.preprocessing.sparql.Sparql.getValues(endpoint, de.citec.sc.sentence.preprocessing.sparql.Sparql.getQueryData(language, uri), language, uri));
    }
    return entities;
}