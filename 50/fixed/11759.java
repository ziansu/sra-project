@java.lang.SuppressWarnings(value = "unchecked")
public <RESPONSE extends org.lastaflute.web.response.ActionResponse> RESPONSE hookError() {
    return ((RESPONSE) (_cause.getErrorHook().hook()));
}