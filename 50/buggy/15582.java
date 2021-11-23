public org.json.JSONObject createSubmission(uk.ac.ebi.biostudy.submission.rest.data.UserSession userSession, org.json.JSONObject obj) throws java.io.IOException, uk.ac.ebi.biostudy.submission.bsclient.BioStudiesClientException {
    org.json.JSONObject sbm = uk.ac.ebi.biostudy.submission.rest.data.Submission.wrap(obj);
    saveSubmission(userSession, sbm);
    return sbm;
}