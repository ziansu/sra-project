public ro.pippo.core.Response status(int status) {
    checkCommitted();
    httpServletResponse.setStatus(status);
    this.status = status;
    return this;
}