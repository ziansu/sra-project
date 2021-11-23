@java.lang.Override
public void init(filter.FilterConfig filterConfig) throws filter.ServletException {
    authUris = new java.util.HashSet<>();
    authUris.add("/app/login");
    authUris.add("/app/signup");
    authUris.add("/app/logout");
}