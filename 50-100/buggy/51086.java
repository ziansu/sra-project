public org.json.JSONObject listSubmissions(uk.ac.ebi.biostudy.submission.rest.user.UserSession userSession) throws java.io.IOException, uk.ac.ebi.biostudy.submission.bsclient.BioStudiesClientException {
    org.json.JSONArray submitted = bsclient.getSubmissions(userSession.getSessid());
    org.json.JSONArray temporary = listTmpSubmissions(userSession);
    org.json.JSONObject obj = new org.json.JSONObject();
    obj.put("submissions", uk.ac.ebi.biostudy.submission.rest.resources.SubmissionService.join(submitted, temporary));
    return obj;
}