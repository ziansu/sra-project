@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/getCustomerRoomFullFromToDate/{fromDate}/{toDate}")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
javax.ws.rs.core.Response getCustomerRoomFullFromToDate(@javax.ws.rs.PathParam(value = "fromDate")
java.lang.String fromDate, @javax.ws.rs.PathParam(value = "toDate")
java.lang.String toDate);