public void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpSession session = req.getSession();
    session.invalidate();
}