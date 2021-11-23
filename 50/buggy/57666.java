protected void remoteProcessAction(javax.portlet.ActionRequest actionRequest, javax.portlet.ActionResponse actionResponse) throws java.lang.Exception {
    org.scribe.model.OAuthRequest oAuthRequest = getOAuthRequest(actionRequest, actionResponse, Verb.POST);
    org.scribe.model.Response response = oAuthRequest.send();
}