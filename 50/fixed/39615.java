@java.lang.Override
public void logout(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.security.core.Authentication authentication) {
    try {
        java.lang.System.out.println("Inside Logout Handler");
        authentication.setAuthenticated(false);
        request.logout();
    } catch (javax.servlet.ServletException e) {
        e.printStackTrace();
    }
}