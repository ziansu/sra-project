@org.junit.Test
public void testQuery() {
    final com.mongodb.BasicDBObject filter = new com.mongodb.BasicDBObject("name", "value");
    new mockit.Expectations() {
        {
            logger.isLoggable(java.util.logging.Level.FINE);
            result = true;
            logger.fine(("query: Querying database with query object " + filter));
            logger.fine((("query: found " + 0) + " assets."));
        }
    };
    mockit.Deencapsulation.invoke(createTestBean(), "query", filter, new com.mongodb.BasicDBObject());
}