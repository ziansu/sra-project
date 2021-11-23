public org.sagebionetworks.evaluation.model.Submission createSubmission(org.sagebionetworks.evaluation.model.Submission submission, java.lang.String etag, java.lang.String teamId, java.lang.String memberStateHash) throws org.sagebionetworks.web.shared.exceptions.RestServiceException {
    org.sagebionetworks.web.server.servlet.SynapseClient synapseClient = createSynapseClient();
    try {
        return synapseClient.createIndividualSubmission(submission, etag);
    } catch (java.lang.Exception e) {
        throw new org.sagebionetworks.web.shared.exceptions.UnknownErrorException(e.getMessage());
    }
}