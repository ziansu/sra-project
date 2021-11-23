public java.lang.Object process(example.dynamic_controller.IDynamicRequestPOST dynamicRequest) throws core.exception.EpikosException {
    example.request.HelloRequest helloRequest = dynamicRequest.getRequest(example.request.HelloRequest.class);
    javax.ws.rs.core.MultivaluedMap<java.lang.String, java.lang.String> pathParam = dynamicRequest.getPathParams();
    example.response.HelloResponse resp = new example.response.HelloResponse();
    resp.setResponseString(("Hello " + (helloRequest.getName())));
    return resp;
}