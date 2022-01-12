public static java.util.List<java.lang.String> getCurrentRevisionIDs(com.couchbase.cbforest.Document doc) throws com.couchbase.cbforest.ForestException {
    java.util.List<java.lang.String> currentRevIDs = new java.util.ArrayList<java.lang.String>();
    do {
        currentRevIDs.add(doc.getSelectedRevID());
    } while (doc.selectNextLeaf(false, false) );
    return currentRevIDs;
}