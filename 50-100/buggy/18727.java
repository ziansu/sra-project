@java.lang.Override
public void apply(org.osgl.http.H.Request req, org.osgl.http.H.Response resp) {
    try {
        java.lang.String url = fullUrl(req);
        if (req.isAjax()) {
            resp.status(H.Status.FOUND_AJAX);
        }else {
            applyStatus(resp);
        }
        resp.header("Location", url);
        applyBeforeCommitHandler(req, resp);
        org.osgl.util.IO.close(resp.outputStream());
        applyAfterCommitHandler(req, resp);
    } finally {
        clearThreadLocals();
    }
}