public org.sagebionetworks.evaluation.model.Submission createIndividualSubmission(org.sagebionetworks.evaluation.model.Submission submission, java.lang.String etag) throws org.sagebionetworks.web.shared.exceptions.RestServiceException {
    org.sagebionetworks.web.server.servlet.SynapseClient synapseClient = createSynapseClient();
    try {
        return synapseClient.createIndividualSubmission(submission, etag);
    } catch (java.lang.Exception e) {
        throw new org.sagebionetworks.web.shared.exceptions.UnknownErrorException(e.getMessage());
    }
}