@java.lang.Override
public void close(java.lang.Object queryResult) {
    if (!(queryResults.remove(queryResult))) {
        org.zoodb.jdo.impl.QueryImpl.LOGGER.warn("QueryResult not found.");
        return ;
    }
    if (queryResult instanceof org.zoodb.jdo.impl.ExtentAdaptor) {
        ((org.zoodb.jdo.impl.ExtentAdaptor<?>) (queryResult)).closeAll();
    }else
        if (queryResult instanceof org.zoodb.jdo.impl.ExtentImpl) {
            ((org.zoodb.jdo.impl.ExtentImpl<?>) (queryResult)).closeAll();
        }else {
            org.zoodb.jdo.impl.QueryImpl.LOGGER.warn("QueryResult not closable.");
        }
    
}