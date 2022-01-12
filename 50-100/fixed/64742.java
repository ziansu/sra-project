public org.apache.cassandra.db.rows.Cell purge(org.apache.cassandra.db.rows.DeletionPurger purger, int nowInSec) {
    if (!(isLive(nowInSec))) {
        if (purger.shouldPurge(timestamp, localDeletionTime))
            return null;
        
        if (isExpiring()) {
            return org.apache.cassandra.db.rows.BufferCell.tombstone(column, timestamp, ((localDeletionTime) - (ttl)), path);
        }
    }
    return this;
}