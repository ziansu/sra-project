private void loginCheck(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    boolean isLoggedIn;
    javax.servlet.http.Cookie[] cookies = request.getCookies();
    isLoggedIn = new com.javabeans.CookiesManager().isUserCorrect(cookies);
    if (isLoggedIn) {
        try {
            response.sendRedirect("login");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}