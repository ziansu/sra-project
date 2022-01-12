@org.springframework.web.bind.annotation.RequestMapping(value = "/ProductAddInit", method = org.springframework.web.bind.annotation.RequestMethod.GET)
private void productAddInit(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    if ((request.getAttribute("userType")) != null) {
        int type = java.lang.Integer.parseInt(request.getAttribute("userType").toString());
        if ((com.services.AuthorityCheckerService.isManager(type)) || (com.services.AuthorityCheckerService.isStaff(type))) {
            response.sendRedirect("ProductAdd.jsp");
        }else {
            response.sendRedirect("AccessDenied.jsp");
        }
    }else {
        response.sendRedirect("AccessDenied.jsp");
    }
}