@java.lang.Override
public float score() throws java.io.IOException {
    final org.apache.solr.ltr.DocInfo docInfo = getDocInfo();
    return (docInfo != null) && (docInfo.hasOriginalDocScore()) ? docInfo.getOriginalDocScore() : originalScorer.score();
}