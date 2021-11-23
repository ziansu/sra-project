public void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse res) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpSession session = req.getSession();
    javax.servlet.RequestDispatcher rd = req.getRequestDispatcher("Booking.jsp");
    rd.forward(req, res);
}