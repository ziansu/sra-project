protected void applyMessage(org.osgl.http.H.Request request, org.osgl.http.H.Response response) {
    java.lang.String msg = getMessage();
    applyBeforeCommitHandler(request, response);
    if (org.osgl.util.S.notBlank(msg)) {
        response.writeContent(msg);
    }else {
        org.osgl.util.IO.close(response.outputStream());
    }
    applyAfterCommitHandler(request, response);
}