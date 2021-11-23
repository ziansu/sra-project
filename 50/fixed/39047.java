@java.lang.Override
public void setResponseStatus(int code) {
    response.status(code);
    status = code;
}