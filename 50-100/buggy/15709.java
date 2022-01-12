@java.lang.Override
public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    java.lang.String action = request.getPathInfo();
    if (org.genepattern.pipelines.PipelineQueryServlet.LIBRARY.equals(action)) {
        constructLibrary(response);
    }else
        if (org.genepattern.pipelines.PipelineQueryServlet.SAVE.equals(action)) {
            savePipeline(response);
        }else {
            sendError(response, action);
        }
    
}