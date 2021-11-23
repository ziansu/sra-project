@java.lang.Override
public void onSuccess(long reqId, java.lang.String header, java.lang.String sequence, java.util.List<biospectra.classify.beans.SearchResultEntry> result, biospectra.classify.beans.ClassificationResult.ClassificationResultType type, java.lang.String taxonRank) {
    if ((responseHandler) != null) {
        responseHandler.onSuccess(reqId, header, sequence, result, type, taxonRank);
    }else {
        biospectra.classify.ClassifierClient.LOG.error("responseHandler is not set");
    }
}