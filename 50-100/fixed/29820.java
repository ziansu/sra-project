@java.lang.Override
protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    java.lang.String op = request.getParameter("op");
    switch (op) {
        case "getTreeJson" :
            getTreeJson(request, response);
        default :
            break;
    }
}