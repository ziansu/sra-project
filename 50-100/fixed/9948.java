@java.lang.Override
public void onSuccess(long reqId, java.lang.String header, java.lang.String sequence, java.util.List<biospectra.classify.beans.SearchResultEntry> result, biospectra.classify.beans.ClassificationResult.ClassificationResultType type, java.lang.String taxonRank) {
    biospectra.classify.beans.ClassificationResult bresult = new biospectra.classify.beans.ClassificationResult(header, sequence, result, type, taxonRank);
    java.lang.String json;
    try {
        json = serializer.toJson(bresult);
        summary.report(bresult);
        synchronized(bw) {
            bw.write((json + "\n"));
        }
    } catch (java.io.IOException ex) {
        biospectra.classify.ClassifierClient.LOG.error("Cannot write to a file", ex);
    }
}