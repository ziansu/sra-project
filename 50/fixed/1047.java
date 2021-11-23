public void doGet(za.co.willmann.HttpServletRequest req, za.co.willmann.HttpServletResponse res) throws java.io.IOException, za.co.willmann.ServletException {
    java.io.PrintWriter out = res.getWriter();
    out.println("Concratulation shiraaz, you reached the HelloServlet!");
    out.close();
}