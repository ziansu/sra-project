private static void replaceDescriptionWithNames(java.util.Collection<? extends edu.stanford.muse.index.Document> allDocs, edu.stanford.muse.index.Archive archive) throws java.lang.Exception {
    for (edu.stanford.muse.index.Document d : allDocs) {
        if (!(edu.stanford.muse.index.Util.nullOrEmpty(d.description))) {
            d.description = edu.stanford.muse.ner.NER.retainOnlyNames(d.description, archive.getLuceneDoc(d));
        }
    }
}