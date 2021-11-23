@java.lang.Override
public com.ebay.oss.bark.domain.DqJob getById(java.lang.String jobId) {
    com.mongodb.DBObject dbo = dbCollection.findOne(new com.mongodb.BasicDBObject("_id", jobId));
    return toEntity(dbo);
}