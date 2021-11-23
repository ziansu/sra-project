@no.ntnu.stud.minvakt.services.DELETE
@no.ntnu.stud.minvakt.services.Path(value = "/{shiftId}/user/{userId}")
@no.ntnu.stud.minvakt.services.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response deleteEmployeeFromShift(@no.ntnu.stud.minvakt.services.PathParam(value = "userId")
int userId, @no.ntnu.stud.minvakt.services.PathParam(value = "shiftId")
int shiftId, @no.ntnu.stud.minvakt.services.QueryParam(value = "findNewEmployee")
boolean findNewEmployee) {
    boolean statusOk = false;
    if (!findNewEmployee) {
        statusOk = shiftDB.deleteEmployeeFromShift(userId, shiftId);
    }else {
    }
    if (statusOk) {
        return javax.ws.rs.core.Response.status(200).build();
    }else {
        return javax.ws.rs.core.Response.status(400).entity("Unable to delete employee").build();
    }
}