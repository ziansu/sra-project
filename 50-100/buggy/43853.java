@java.lang.Override
public java.util.concurrent.ConcurrentNavigableMap<org.apache.hadoop.hbase.Cell, org.apache.hadoop.hbase.Cell> subMap(org.apache.hadoop.hbase.Cell fromKey, boolean fromInclusive, org.apache.hadoop.hbase.Cell toKey, boolean toInclusive) {
    int toIndex = getValidIndex(toKey, toInclusive);
    int fromIndex = (getValidIndex(fromKey, (!fromInclusive))) - 1;
    if (fromIndex > toIndex)
        throw new java.lang.IllegalArgumentException("inconsistent range");
    
    return createCellBlocks(comparator, fromIndex, toIndex);
}