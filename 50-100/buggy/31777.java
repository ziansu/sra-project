protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    javax.servlet.ServletOutputStream out = resp.getOutputStream();
    out.write(out.write(request.getParameter("age").getBytes()));
    out.flush();
    out.close();
}