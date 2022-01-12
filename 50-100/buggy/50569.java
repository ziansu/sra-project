@org.springframework.web.bind.annotation.RequestMapping(value = "/ProductAddInit", method = org.springframework.web.bind.annotation.RequestMethod.GET)
private void productAddInit(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.System.out.println("GO TO PRODUCT ADD");
    int type = java.lang.Integer.parseInt(request.getAttribute("userType").toString());
    if ((com.services.AuthorityCheckerService.isManager(type)) || (com.services.AuthorityCheckerService.isStaff(type))) {
        java.lang.System.out.println("ALLOWED");
        response.sendRedirect("ProductAdd.jsp");
    }else {
        java.lang.System.out.println("DENIED");
        response.sendRedirect("AccessDenied.jsp");
    }
}