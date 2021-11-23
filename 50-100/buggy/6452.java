private void removeStopWords() {
    for (java.util.Iterator<java.lang.String> iterator = terms.iterator(); iterator.hasNext();) {
        java.lang.String term = iterator.next();
        for (java.lang.String stopWord : stopwords) {
            if (term.equals(stopWord)) {
                log.info((("[StopWords] Remove term[" + term) + "] to ranking"));
                iterator.remove();
            }
        }
    }
}