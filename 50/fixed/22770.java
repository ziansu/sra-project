@java.lang.Override
public org.takes.Response act(final org.takes.Request req) throws java.io.IOException {
    return new org.takes.facets.ret.RsReturn(new org.takes.rs.RsRedirect("/"), new org.takes.rq.RqHref.Base(req).href().toString());
}