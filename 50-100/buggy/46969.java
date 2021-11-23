public static void setCors(com.ericsson.research.trap.nhttpd.IHTTPSession session, com.ericsson.research.trap.nhttpd.Response r) {
    java.lang.String origin = session.getHeaders().get("Origin");
    if (origin == null)
        origin = "null";
    
    r.addHeader("Allow", "GET,PUT,POST,DELETE,OPTIONS");
    r.addHeader("Access-Control-Allow-Origin", origin);
    r.addHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
    r.addHeader("Access-Control-Allow-Headers", "Content-Type");
    r.addHeader("Access-Control-Request-Methods", "GET,PUT,POST,DELETE,OPTIONS");
    r.addHeader("Access-Control-Request-Headers", "Content-Type");
    r.addHeader("Access-Control-Max-Age", "3600");
}