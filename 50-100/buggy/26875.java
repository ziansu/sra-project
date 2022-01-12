public static java.util.List<java.lang.String> getCurrentRevisionIDs(com.couchbase.cbforest.Document doc, boolean includeDeleted) throws com.couchbase.cbforest.ForestException {
    java.util.List<java.lang.String> currentRevIDs = new java.util.ArrayList<java.lang.String>();
    do {
        if (includeDeleted || (!(doc.selectedRevDeleted())))
            currentRevIDs.add(doc.getSelectedRevID());
        
    } while (doc.selectNextLeaf(includeDeleted, false) );
    return currentRevIDs;
}