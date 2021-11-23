public java.util.Set<java.lang.String> get_entities(java.lang.String text) {
    org.insightcentre.nerservice.StanfordCoreNLPHandler.logger.info(("Get entities for :" + text));
    java.util.Set<java.lang.String> names = entities.getNamedEntities(text);
    org.insightcentre.nerservice.StanfordCoreNLPHandler.logger.info(names);
    return names;
}