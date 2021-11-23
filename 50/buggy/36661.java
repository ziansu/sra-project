public java.lang.Integer getWaitForResponses() {
    if ((waitForResponses) == null) {
        return 0;
    }else
        if ((waitForResponses) == (-1)) {
            return java.lang.Integer.MAX_VALUE;
        }else {
            return waitForResponses;
        }
    
}