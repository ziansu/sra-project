@java.lang.Override
public boolean handleResponse(com.google.api.client.http.HttpRequest request, com.google.api.client.http.HttpResponse response, boolean supportsRetry) throws java.io.IOException {
    if (wrappedCredential.handleResponse(request, response, supportsRetry)) {
        return true;
    }else
        if (backoffHandler.handleResponse(request, response, supportsRetry)) {
            return true;
        }else {
            return false;
        }
    
}