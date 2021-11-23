protected void setResultActivityError(java.lang.String srvStr, java.lang.Exception e) {
    resultActivityError = ((e.getClass().getName()) + " : Cannot connect to ") + srvStr;
    java.lang.String msg = e.getMessage();
    if (msg != null)
        resultActivityError.concat((" : " + (e.getMessage())));
    
}