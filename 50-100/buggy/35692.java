protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws java.io.IOException, javax.servlet.ServletException {
    try {
        java.util.Map<java.lang.String, java.lang.String> result = indexer.Retriever.search(indexer.SearchServlet.indexDir, request.getParameter("q"));
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("res", result);
        request.setAttribute("dataDir", indexer.SearchServlet.dataDir);
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}