protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    java.lang.System.out.println(request);
    java.io.PrintWriter out = response.getWriter();
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    java.lang.String vAssignment = mapper.writeValueAsString(vehicles);
    out.print(vAssignment);
}