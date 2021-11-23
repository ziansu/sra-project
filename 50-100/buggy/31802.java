public org.json.JSONObject submitSubmission(uk.ac.ebi.biostudy.submission.rest.data.UserSession userSession, org.json.JSONObject obj) throws java.io.IOException, uk.ac.ebi.biostudy.submission.bsclient.BioStudiesClientException {
    java.lang.String acc = obj.getString("accno");
    org.json.JSONObject sbm = obj.getJSONObject("data");
    org.json.JSONObject result = (uk.ac.ebi.biostudy.submission.rest.data.Submission.isGeneratedAccession(acc)) ? bsclient.submitNew(sbm, userSession.getSessid()) : bsclient.submitUpdated(sbm, userSession.getSessid());
    bsclient.deleteTmpSubmission(acc, userSession.getSessid());
    return result;
}