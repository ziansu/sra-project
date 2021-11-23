@java.lang.SuppressWarnings(value = "unchecked")
public T findOneByCondition(jadeutils.mongo.Condition cdt) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
    logger.debug(("befor query: " + (null == cdt ? null : cdt.toString())));
    com.mongodb.DBObject condition = jadeutils.mongo.impl.MongoUtil.parseCondition(cdt);
    com.mongodb.DBObject rec = this.collection.findOne(condition);
    T model = ((T) (jadeutils.mongo.impl.MongoUtil.genModelFromRec(entryClass, rec)));
    return model;
}