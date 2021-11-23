@javax.annotation.PostConstruct
public void connect() {
    org.mongodb.morphia.Morphia morphia = new org.mongodb.morphia.Morphia();
    org.reflections.Reflections reflections = new org.reflections.Reflections();
    java.util.Set<java.lang.Class<?>> annotated = reflections.getTypesAnnotatedWith(org.mongodb.morphia.annotations.Entity.class);
    for (java.lang.Class<?> entity : annotated) {
        morphia.map(entity);
    }
    datastore = morphia.createDatastore(new com.mongodb.MongoClient(config.getMongoAddress()), config.getMongoDatabase());
    datastore.ensureIndexes();
}