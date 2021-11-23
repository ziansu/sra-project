@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/save")
@javax.ws.rs.Produces(value = "application/json")
public javax.ws.rs.core.Response saveReport(@javax.ws.rs.FormParam(value = "report")
java.lang.String report, @javax.ws.rs.FormParam(value = "groupid")
int groupid) {
    java.lang.String report_name = com.caxpy.bi.utility.BiUtility.saveReport(report, groupid);
    java.util.Map<java.lang.String, java.lang.String> resData = new java.util.HashMap<java.lang.String, java.lang.String>();
    resData.put("status", "success");
    resData.put("report", report_name);
    return javax.ws.rs.core.Response.status(200).entity(resData).build();
}