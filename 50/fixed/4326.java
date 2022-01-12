private static void generateOrderDate() {
    code.SendEmailServlet.date = new java.util.Date();
    code.SendEmailServlet.uniqueOrderDate = code.SendEmailServlet.dateFormat.format(code.SendEmailServlet.date);
    java.lang.System.out.println(code.SendEmailServlet.uniqueOrderDate);
}