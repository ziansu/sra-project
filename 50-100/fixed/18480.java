private void displayLink(javax.servlet.jsp.JspWriter out) throws java.io.IOException {
    out.println("<div class=\"btn-group btn-group-sm pull-right\" role=\"group\">");
    out.println((("<a type=\"button\" class=\"btn btn-default\" href=" + (href(10))) + " >10</a>"));
    out.println((("<a type=\"button\" class=\"btn btn-default\" href=" + (href(50))) + " >50</a>"));
    out.println((("<a type=\"button\" class=\"btn btn-default\" href=" + (href(100))) + " >100</a>"));
    out.println("</div>");
}