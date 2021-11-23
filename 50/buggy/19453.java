public com.inversoft.rest.RESTClient<RS, ERS> errorResponseHandler(com.inversoft.rest.RESTClient.ResponseHandler<ERS> errorResponseFunction) {
    this.errorResponseHandler = errorResponseFunction;
    return this;
}