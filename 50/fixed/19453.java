public com.inversoft.rest.RESTClient<RS, ERS> errorResponseHandler(com.inversoft.rest.RESTClient.ResponseHandler<ERS> errorResponseHandler) {
    this.errorResponseHandler = errorResponseHandler;
    return this;
}