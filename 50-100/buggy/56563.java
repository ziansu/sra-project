@java.lang.Override
public void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException {
    java.io.PrintWriter w = resp.getWriter();
    w.println("<!DOCTYPE html>");
    w.println("<meta charset=\"utf-8\">");
    w.println("<title>Asserting Identity to Google APIs - App Engine App Identity Example</title>");
    w.println("<form method=\"post\">");
    w.println("<label for=\"longUrl\">URL:</label>");
    w.println("<input id=\"longUrl\" name=\"longUrl\" type=\"text\">");
    w.println("<input type=\"submit\" value=\"Shorten\">");
    w.println("</form>");
}