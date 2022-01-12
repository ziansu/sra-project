@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/summaryExport")
@javax.ws.rs.Produces(value = "application/vnd.ms-excel")
public javax.ws.rs.core.Response summaryExport(@javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest httpRequest, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletResponse httpResponse, gov.nih.nci.cananolab.dto.particle.AdvancedSampleSearchBean searchBean) {
    try {
        gov.nih.nci.cananolab.restful.sample.AdvancedSampleSearchBO searchSampleBO = ((gov.nih.nci.cananolab.restful.sample.AdvancedSampleSearchBO) (gov.nih.nci.cananolab.restful.context.SpringApplicationContext.getBean("advancedSampleSearchBO")));
        java.lang.String result = searchSampleBO.export(searchBean, httpRequest, httpResponse);
        return javax.ws.rs.core.Response.ok("").build();
    } catch (java.lang.Exception e) {
        return javax.ws.rs.core.Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(gov.nih.nci.cananolab.restful.util.CommonUtil.wrapErrorMessageInList(("Error while exporting the file" + (e.getMessage())))).build();
    }
}