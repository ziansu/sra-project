private void doAny(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpSession session = request.getSession(false);
    if (session == null) {
        java.lang.String reference = request.getParameter("reference");
        request.setAttribute("action", reference);
        request.getRequestDispatcher("start.jsp").forward(request, response);
    }else {
        request.getRequestDispatcher("work.jsp").forward(request, response);
    }
}