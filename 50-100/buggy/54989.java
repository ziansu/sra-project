@java.lang.Override
public void delete(org.apache.cassandra.db.DecoratedKey key, org.apache.cassandra.utils.concurrent.OpOrder.Group opGroup) {
    if (!(isExcluded)) {
        com.stratio.cassandra.lucene.Index.logger.debug("Removing row from Lucene index {}", name);
        try {
            service.delete(key);
            service = null;
        } catch (java.lang.Exception e) {
            com.stratio.cassandra.lucene.Index.logger.error(("Error deleting row in Lucene index " + (name)), e);
        }
    }else {
        com.stratio.cassandra.lucene.Index.logger.debug("Ignoring excluded deletion in Lucene index {}", name);
    }
}