@java.lang.Override
public void setStatusCode(int statusCode) {
    if ((response) != null)
        response.setStatus(statusCode);
    
}