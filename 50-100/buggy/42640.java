private com.yahoo.ycsb.Status getStatus(int responseCode) {
    int rc = responseCode / 100;
    if (responseCode == 400)
        return com.yahoo.ycsb.Status.BAD_REQUEST;
    
    if (responseCode == 403)
        return com.yahoo.ycsb.Status.FORBIDDEN;
    
    if (responseCode == 404)
        return com.yahoo.ycsb.Status.NOT_FOUND;
    
    if (responseCode == 501)
        return com.yahoo.ycsb.Status.NOT_IMPLEMENTED;
    
    if (responseCode == 503)
        return com.yahoo.ycsb.Status.SERVICE_UNAVAILABLE;
    
    if (rc == 5)
        return com.yahoo.ycsb.Status.ERROR;
    
    return com.yahoo.ycsb.Status.OK;
}