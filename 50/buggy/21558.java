private org.json.JSONObject requestAcceptProposal() throws org.json.JSONException {
    org.json.JSONObject request = new org.json.JSONObject();
    request.put("method", "accept_proposal");
    request.put("proposal_id", getProposalId());
    request.put("kpu_id", sequenceId);
    return request;
}