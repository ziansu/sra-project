protected void resetCookies(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    for (javax.servlet.http.Cookie cookie : request.getCookies()) {
        if ((net.exposedrecords.web.controller.SubscriptionController.COOKIE_EMAIL.equals(cookie.getName())) || (net.exposedrecords.web.controller.SubscriptionController.COOKIE_EMAIL_VERIFIED.equals(cookie.getName()))) {
            cookie.setMaxAge(0);
            cookie.setValue(null);
            response.addCookie(cookie);
        }
    }
}