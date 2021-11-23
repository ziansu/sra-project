protected static boolean isRecoverableException(com.amazonaws.AmazonServiceException ex) {
    if ((ex.getErrorType()) == null) {
        return false;
    }
    switch (ex.getErrorType()) {
        case Client :
            if (ex instanceof com.amazonaws.services.kinesis.model.ProvisionedThroughputExceededException) {
                return true;
            }else {
                return false;
            }
        case Service :
        case Unknown :
            return true;
        default :
            return false;
    }
}