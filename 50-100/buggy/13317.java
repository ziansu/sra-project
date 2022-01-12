public void parseCause() {
    com.telefonica.euro_iaas.sdc.rest.exception.ErrorCode errorCode = com.telefonica.euro_iaas.sdc.rest.exception.ErrorCode.find(cause.toString());
    this.code = errorCode.getCode();
    this.publicMessage = errorCode.getPublicMessage();
    this.message = ((errorCode.toString()) + "#") + (cause.getMessage());
    this.httpCode = errorCode.getHttpCode();
}