com.mongodb.bulk.BulkWriteError getBulkWriteError(final com.mongodb.WriteConcernException writeException, int index) {
    return new com.mongodb.bulk.BulkWriteError(writeException.getErrorCode(), writeException.getErrorMessage(), translateGetLastErrorResponseToErrInfo(writeException.getResponse()), index);
}