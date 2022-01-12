public java.lang.String handleRequest(java.lang.String path, java.lang.String query, java.lang.String content, java.lang.String methodString) {
    opcua.clientTranslator.RequestAggregate.Method method = opcua.clientTranslator.RequestAggregate.Method.valueOf(methodString);
    opcua.clientTranslator.RequestAggregate currentRequest = new opcua.clientTranslator.RequestAggregate(this, method, path, query, content);
    this.requests.add(currentRequest);
    return currentRequest.getResponse();
}