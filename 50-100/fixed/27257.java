public T get() throws java.lang.Exception {
    waitForPromiseSuccess();
    if ((response) != null) {
        return response;
    }else {
        if ((this.exception) instanceof java.io.IOException) {
            throw ((java.io.IOException) (this.exception));
        }else
            if ((this.exception) instanceof java.util.concurrent.TimeoutException) {
                throw new java.util.concurrent.TimeoutException();
            }else {
                throw new java.io.IOException(this.exception);
            }
        
    }
}