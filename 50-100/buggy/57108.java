@java.lang.Override
protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.http.HttpSession session = request.getSession(true);
    java.lang.String do_this = request.getParameter("report");
    if (do_this == null) {
        forward(request, response, "/index.html");
    }else
        switch (do_this) {
            case "create" :
                createReport(request, response, session);
                forward(request, response, "/CreateReport.jsp");
                break;
        }
    
}