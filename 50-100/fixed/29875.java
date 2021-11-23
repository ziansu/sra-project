public void completeRequest() throws com.sforce.async.AsyncApiException {
    try {
        csvStream.close();
        java.io.InputStream result = transport.getContent();
        if (!(transport.isSuccessful())) {
            com.sforce.async.BulkConnection.parseAndThrowException(result);
        }
    } catch (java.io.IOException e) {
        throw new com.sforce.async.AsyncApiException("Failed to complete request", AsyncExceptionCode.ClientInputError, e);
    }
}