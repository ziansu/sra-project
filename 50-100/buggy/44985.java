public org.json.JSONObject getSubmission(final uk.ac.ebi.biostudy.submission.rest.data.UserSession userSession, final java.lang.String accno) throws java.io.IOException, uk.ac.ebi.biostudy.submission.bsclient.BioStudiesClientException {
    org.json.JSONObject obj = bsclient.getTmpSubmission(accno, userSession.getSessid());
    if (obj != null) {
        return obj;
    }
    return uk.ac.ebi.biostudy.submission.rest.data.Submission.wrap(bsclient.getSubmission(accno, userSession.getSessid()));
}