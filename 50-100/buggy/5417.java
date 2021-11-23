@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/semesterId/{semesterId}/groupNo/{groupNo}/type/{type}")
@javax.ws.rs.Produces(value = "application/pdf")
public javax.ws.rs.core.Response createOrViewSeatPlan(@javax.ws.rs.core.Context
final javax.ws.rs.core.Request pRequest, @javax.ws.rs.PathParam(value = "semesterId")
final java.lang.String pSemesterId, @javax.ws.rs.PathParam(value = "groupNo")
final java.lang.String pGroupNo, @javax.ws.rs.PathParam(value = "type")
final java.lang.String pType) throws java.lang.Exception {
    javax.ws.rs.core.StreamingOutput strem = mSeatPlanResourceHelper.createOrCheckSeatPlanAndReturnRoomList(java.lang.Integer.parseInt(pSemesterId), java.lang.Integer.parseInt(pGroupNo), java.lang.Integer.parseInt(pType), pRequest, mUriInfo);
    java.io.File file = new java.io.File(org.ums.common.academic.resource.SeatPlanResource.FILE_PATH);
    javax.ws.rs.core.Response.ResponseBuilder response = javax.ws.rs.core.Response.ok(((java.lang.Object) (file)));
    response.header("SeatPlan Report", "attachment;filename=seatPlanReport.pdf");
    return response.build();
}