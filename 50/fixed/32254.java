public void dispatchRequest(java.lang.String request) throws java.lang.InterruptedException {
    trackRequest(request);
    dispatch(request);
}