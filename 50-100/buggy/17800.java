private void updateEntryScores() {
    for (java.util.HashMap<java.lang.String, src.src.PostingsList> map : index.values()) {
        for (src.src.PostingsList ps : map.values()) {
            for (src.src.PostingsEntry pe : ps.postingsEntries) {
                pe.score /= super.docLengths.get(("" + (pe.docID)));
            }
        }
    }
}