@java.lang.Override
public int getStatusCode() {
    if ((response) != null)
        return response.getStatus();
    
    return status;
}