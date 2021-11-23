public com.inversoft.rest.RESTClient<RS, ERS> successResponseHandler(com.inversoft.rest.RESTClient.ResponseHandler<RS> successResponseFunction) {
    this.successResponseHandler = successResponseFunction;
    return this;
}