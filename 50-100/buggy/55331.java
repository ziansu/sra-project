protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    try {
        javax.servlet.http.HttpSession session = request.getSession(false);
        if ((session.getAttribute("authenticated")) == null) {
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return ;
        }else {
            request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
            return ;
        }
    } catch (java.lang.Exception e) {
        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
}