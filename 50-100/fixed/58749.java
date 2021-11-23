public com.kazuki43zoo.domain.MockApiResponse findOne(java.lang.String path, java.lang.String method) {
    com.kazuki43zoo.domain.MockApiResponse mockResponse = repository.findOneByUk(path, method.toUpperCase());
    if (mockResponse == null) {
        mockResponse = new com.kazuki43zoo.domain.MockApiResponse();
        mockResponse.setPath(path);
        mockResponse.setMethod(method);
    }
    return mockResponse;
}