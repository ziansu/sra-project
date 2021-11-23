@resources.POST
@resources.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@resources.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public models.Researcher addResearcher(models.Researcher researcher) throws java.lang.Exception {
    return researcherService.addResearcher(researcher);
}