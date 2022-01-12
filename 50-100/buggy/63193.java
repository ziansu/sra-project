public org.json.JSONObject editSubmission(final uk.ac.ebi.biostudy.submission.rest.data.UserSession userSession, final java.lang.String accno) throws java.io.IOException, uk.ac.ebi.biostudy.submission.bsclient.BioStudiesClientException {
    org.json.JSONObject sbm = getSubmission(userSession, accno);
    org.json.JSONObject tmp = bsclient.getTmpSubmission(sbm.getString("accno"), userSession.getSessid());
    if (tmp == null) {
        saveSubmission(userSession, sbm);
    }
    return sbm;
}