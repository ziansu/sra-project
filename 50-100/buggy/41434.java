protected void doPost(DigitalGraffiti.Servlets.HttpServletRequest request, DigitalGraffiti.Servlets.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    response.setContentType("application/toJson");
    org.json.JSONObject json = ((org.json.JSONObject) (request.getAttribute("toJson")));
    DigitalGraffiti.Models.Post post = new DigitalGraffiti.Models.Post(json);
    repository.savePost(post);
    response.getWriter().print("{}");
}