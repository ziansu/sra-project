@java.lang.Override
public void service(final javax.servlet.ServletRequest req, final javax.servlet.ServletResponse res) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpServletRequest request;
    javax.servlet.http.HttpServletResponse response;
    if (!((req instanceof javax.servlet.http.HttpServletRequest) && (res instanceof javax.servlet.http.HttpServletResponse))) {
        throw new javax.servlet.ServletException("non-HTTP request or response");
    }
    request = ((javax.servlet.http.HttpServletRequest) (req));
    response = ((javax.servlet.http.HttpServletResponse) (res));
    doGet(request, response);
}