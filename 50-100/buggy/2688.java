protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException, javax.servlet.ServletException {
    wp = ((domain.Werkplaats) (getServletContext().getAttribute("wp")));
    if (!(wp.AfsprakenNietOuderWeek().isEmpty())) {
        req.setAttribute("afspraken", wp.AfsprakenNietOuderWeek());
        java.lang.System.out.println(wp.AfsprakenNietOuderWeek());
    }
    req.getRequestDispatcher("afspraakHome.jsp").forward(req, resp);
}