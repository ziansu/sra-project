@java.lang.Override
public jadeutils.mongo.MongoResultSet<T> findByCondition(jadeutils.mongo.Condition cdt) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
    logger.debug(("befor query: " + (null == cdt ? null : cdt.toString())));
    com.mongodb.DBObject condition = jadeutils.mongo.impl.MongoUtil.parseCondition(cdt);
    com.mongodb.DBCursor cursor = this.collection.find(condition);
    return new jadeutils.mongo.MongoResultSet(entryClass, cursor);
}