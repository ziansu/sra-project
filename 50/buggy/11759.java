@java.lang.SuppressWarnings(value = "unchecked")
protected <RESPONSE extends org.lastaflute.web.response.ActionResponse> RESPONSE hookError() {
    return ((RESPONSE) (_cause.getErrorHook().hook()));
}