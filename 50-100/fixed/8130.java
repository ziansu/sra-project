@java.lang.Override
public void service(final javax.servlet.ServletRequest req, final javax.servlet.ServletResponse res) throws java.io.IOException, javax.servlet.ServletException {
    if (!((req instanceof javax.servlet.http.HttpServletRequest) && (res instanceof javax.servlet.http.HttpServletResponse))) {
        throw new javax.servlet.ServletException("non-HTTP request or response");
    }
    javax.servlet.http.HttpServletRequest request = ((javax.servlet.http.HttpServletRequest) (req));
    javax.servlet.http.HttpServletResponse response = ((javax.servlet.http.HttpServletResponse) (res));
    doGet(request, response);
}