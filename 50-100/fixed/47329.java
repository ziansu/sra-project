@java.lang.Override
public T findAndUpdate(org.bson.Document filter, org.bson.Document update, java.lang.Class<T> clazz) {
    org.bson.Document doc = collection.findOneAndUpdate(filter, update);
    if (doc == null) {
        return null;
    }
    return us.jakeabel.mpa.util.MongoUtils.fromDocument(doc, clazz);
}