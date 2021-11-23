@java.lang.Override
protected void renderMergedOutputModel(java.util.Map<java.lang.String, java.lang.Object> model, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.lang.Exception {
    java.lang.Object src = model.get("src");
    java.io.PrintWriter writer = response.getWriter();
    java.lang.System.out.println(gson.toJson(src).toString());
    writer.write(gson.toJson(src));
}