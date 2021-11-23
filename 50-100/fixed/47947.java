private org.wikimedia.search.highlighter.experimental.HitEnum buildTermVectorsHitEnum() throws java.io.IOException {
    return org.wikimedia.highlighter.experimental.lucene.hit.PostingsHitEnum.fromTermVectors(context.hitContext.reader(), context.hitContext.docId(), context.mapper.fieldType().name(), weigher.acceptableTerms(), getQueryWeigher(), getCorpusWeigher(false), weigher);
}