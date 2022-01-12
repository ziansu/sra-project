public java.util.List<java.lang.String> getEntitiesInDoc(edu.stanford.muse.index.edu.stanford.muse.index.Document doc, java.lang.String type) {
    edu.stanford.muse.index.Document ldoc = null;
    try {
        ldoc = indexer.getDoc(doc);
    } catch (java.io.IOException e) {
        edu.stanford.muse.index.Archive.log.warn((("Unable to obtain document " + (doc.getUniqueId())) + " from index"));
        e.printStackTrace();
        return null;
    }
    return edu.stanford.muse.index.Archive.getEntitiesInLuceneDoc(ldoc, type);
}