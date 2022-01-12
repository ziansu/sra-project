@java.lang.Override
public void serve(neoe.httpd.IHttpRequest req, neoe.httpd.IHttpResponse resp, java.util.Map m) throws java.lang.Exception {
    m.put("c", getContent(m));
}