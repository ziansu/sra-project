public int getColumnIndex(org.apache.kylin.metadata.model.TblColRef colRef) {
    java.lang.Integer index = columnIndexMap.get(colRef);
    if (index == null)
        throw new java.lang.IllegalArgumentException((("Column " + (colRef.toString())) + " wasn't found on flat table."));
    
    return index.intValue();
}