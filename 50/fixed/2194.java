@java.lang.Override
public java.util.Collection<T> models() {
    return io.minecloud.db.mongo.AbstractMongoRepository.find().asList();
}