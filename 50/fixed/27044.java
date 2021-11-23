boolean areSerializedFieldsEqual(org.apache.hadoop.hbase.filter.LongComparator other) {
    if (other == (this))
        return true;
    
    return super.areSerializedFieldsEqual(other);
}