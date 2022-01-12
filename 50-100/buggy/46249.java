void createXMLResponse(javax.servlet.http.HttpServletResponse response, java.util.List<ch.systemsx.sybit.crkwebui.shared.model.PdbInfo> pdbList) throws java.io.IOException, javax.xml.bind.JAXBException {
    if (pdbList == null)
        return ;
    
    response.setContentType("text/xml");
    response.setCharacterEncoding("UTF-8");
    java.io.PrintWriter writer = response.getWriter();
    ch.systemsx.sybit.crkwebui.server.files.downloader.servlets.DataDownloadServlet.serializePdbInfoList(pdbList, writer);
}