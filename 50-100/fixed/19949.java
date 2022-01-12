protected static boolean isRecoverableException(com.amazonaws.AmazonServiceException ex) {
    if ((ex.getErrorType()) == null) {
        return false;
    }
    switch (ex.getErrorType()) {
        case Client :
            return ex instanceof com.amazonaws.services.kinesis.model.ProvisionedThroughputExceededException;
        case Service :
        case Unknown :
            return true;
        default :
            return false;
    }
}