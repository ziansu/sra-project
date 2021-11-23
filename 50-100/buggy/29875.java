public void completeRequest() throws com.sforce.async.AsyncApiException {
    try {
        csvStream.close();
        if (!(transport.isSuccessful())) {
            com.sforce.async.BulkConnection.parseAndThrowException(transport.getContent());
        }
    } catch (java.io.IOException e) {
        throw new com.sforce.async.AsyncApiException("Failed to complete request", AsyncExceptionCode.ClientInputError, e);
    }
}