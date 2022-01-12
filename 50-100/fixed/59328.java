public se.kth.krijor.TinySearchEngine.WordContainer difference(se.kth.krijor.TinySearchEngine.WordContainer wrd) {
    se.kth.krijor.TinySearchEngine.WordContainer result = new se.kth.krijor.TinySearchEngine.WordContainer();
    if (wrd == null) {
        wrd = new se.kth.krijor.TinySearchEngine.WordContainer();
    }
    for (se.kth.krijor.Document doc : this.get()) {
        if (!(wrd.hasDocument(doc))) {
            result.addDocAndRelevance(doc, this.getRelevance(doc));
        }
    }
    return result;
}