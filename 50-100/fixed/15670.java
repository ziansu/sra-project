@java.lang.Override
public jadeutils.mongo.MongoResultSet<T> findByCondition(jadeutils.mongo.Condition cdt) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
    com.mongodb.DBObject condition = jadeutils.mongo.impl.MongoUtil.parseCondition(cdt);
    logger.debug(("befor query: " + (null == condition ? null : condition.toString())));
    com.mongodb.DBCursor cursor = this.collection.find(condition);
    return new jadeutils.mongo.MongoResultSet(entryClass, cursor);
}