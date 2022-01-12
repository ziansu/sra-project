private com.yahoo.ycsb.Status getStatus(int responseCode) {
    int rc = responseCode / 100;
    if (responseCode == 400) {
        return com.yahoo.ycsb.Status.BAD_REQUEST;
    }else
        if (responseCode == 403) {
            return com.yahoo.ycsb.Status.FORBIDDEN;
        }else
            if (responseCode == 404) {
                return com.yahoo.ycsb.Status.NOT_FOUND;
            }else
                if (responseCode == 501) {
                    return com.yahoo.ycsb.Status.NOT_IMPLEMENTED;
                }else
                    if (responseCode == 503) {
                        return com.yahoo.ycsb.Status.SERVICE_UNAVAILABLE;
                    }else
                        if (rc == 5) {
                            return com.yahoo.ycsb.Status.ERROR;
                        }
                    
                
            
        
    
    return com.yahoo.ycsb.Status.OK;
}