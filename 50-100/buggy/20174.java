@java.lang.Override
public boolean handlesRequest(javax.servlet.http.HttpServletRequest request) {
    return (((request.getRequestURI().equals("")) || (request.getRequestURI().equals("/"))) || (request.getRequestURI().equals(server.getBasePath()))) || (request.getRequestURI().equals(((server.getBasePath()) + "/")));
}