@java.lang.Override
public boolean hasError(org.springframework.http.client.ClientHttpResponse response) throws java.io.IOException {
    final org.springframework.http.HttpStatus httpStatus = getHttpStatusCode(response);
    if (JSON_RPC_STATUES.contains(httpStatus.value())) {
        final org.springframework.http.MediaType contentType = response.getHeaders().getContentType();
        if (MappingJacksonRPC2HttpMessageConverter.APPLICATION_JSON_RPC.isCompatibleWith(contentType))
            return false;
        
    }
    return ((httpStatus.series()) == (HttpStatus.Series.CLIENT_ERROR)) || ((httpStatus.series()) == (HttpStatus.Series.SERVER_ERROR));
}