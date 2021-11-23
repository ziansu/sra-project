public int getColumnIndex(org.apache.kylin.metadata.model.TblColRef colRef) {
    java.lang.String key = org.apache.kylin.cube.model.CubeJoinedFlatTableDesc.colName(colRef.getCanonicalName());
    java.lang.Integer index = columnIndexMap.get(key);
    if (index == null)
        throw new java.lang.IllegalArgumentException((("Column " + (colRef.toString())) + " wasn't found on flat table."));
    
    return index.intValue();
}