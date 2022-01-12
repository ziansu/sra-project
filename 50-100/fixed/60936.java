public static tasker.model.User validated(javax.servlet.http.HttpServletRequest request) {
    javax.servlet.http.Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (int i = 0; i < (cookies.length); i++) {
            if (cookies[i].getName().equals("sid")) {
                java.lang.String sid = cookies[i].getValue();
                return tasker.components.Login.database.getUser(sid);
            }
        }
    }
    return null;
}