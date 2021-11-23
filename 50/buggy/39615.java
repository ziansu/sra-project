@java.lang.Override
public void logout(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.security.core.Authentication authentication) {
    try {
        java.lang.System.out.println("Inside Logout Handler");
        request.logout();
        authentication.setAuthenticated(false);
    } catch (javax.servlet.ServletException e) {
        e.printStackTrace();
    }
}