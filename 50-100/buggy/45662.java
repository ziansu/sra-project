private com.qubit.topnet.Handler getErrorHandler(com.qubit.topnet.Handler handler) {
    com.qubit.topnet.Handler errorHandler = com.qubit.topnet.errors.ErrorHandlingConfig.getErrorHandlingConfig().getDefaultErrorHandler(getErrorCode(), errorOccured);
    request.setAssociatedException(this.errorException);
    if (handler != null) {
        com.qubit.topnet.Handler tmp = handler.getErrorHandler();
        if (tmp != null) {
            errorHandler = tmp;
        }
    }
    return errorHandler;
}