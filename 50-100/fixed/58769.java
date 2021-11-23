@java.lang.Override
public ai.labs.persistence.mongo.IResource<T> newResource(java.lang.String id, java.lang.Integer version, T content) throws java.io.IOException {
    org.bson.Document doc = org.bson.Document.parse(documentBuilder.toString(content));
    ai.labs.persistence.mongo.MongoResourceStorage<T>.Resource resource = new Resource(new org.bson.Document(doc));
    resource.setVersion(version);
    resource.setId(id);
    return resource;
}