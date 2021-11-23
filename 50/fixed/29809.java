private void logout(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, int id) {
    request.getSession().invalidate();
}