@javax.ws.rs.PUT
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_PLAIN)
public java.lang.String createComponentGroup(DTO.LoanDTO loan) {
    int returnStatus = dao.createLoan(loan);
    if (returnStatus == 1)
        return "All Ok";
    else
        throw new javax.ws.rs.WebApplicationException(500);
    
}