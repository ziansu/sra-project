@java.lang.Override
public boolean needFiltering(org.apache.cassandra.config.CFMetaData cfm) {
    if (isEmpty())
        return false;
    
    return (hasUnrestrictedPartitionKeyComponents(cfm)) || (hasSlice());
}