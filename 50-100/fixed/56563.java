@java.lang.Override
public void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws java.io.IOException {
    java.io.PrintWriter writer = resp.getWriter();
    writer.println("<!DOCTYPE html>");
    writer.println("<meta charset=\"utf-8\">");
    writer.println("<title>Asserting Identity to Google APIs - App Engine App Identity Example</title>");
    writer.println("<form method=\"post\">");
    writer.println("<label for=\"longUrl\">URL:</label>");
    writer.println("<input id=\"longUrl\" name=\"longUrl\" type=\"text\">");
    writer.println("<input type=\"submit\" value=\"Shorten\">");
    writer.println("</form>");
}