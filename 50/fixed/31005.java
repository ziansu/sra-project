@pl.edu.amu.rest.Path(value = "/{offerId}/highestBid")
@pl.edu.amu.rest.GET
@pl.edu.amu.rest.ApiOperation(value = "Get a highest bid for an offer", notes = "Highest bid of an offer.")
@pl.edu.amu.rest.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public pl.edu.amu.rest.model.Bid getHighestBid(@org.hibernate.validator.constraints.NotBlank(message = "{getOffer.offerId.empty}")
@javax.validation.constraints.Pattern(regexp = "\\d+", message = "{offerId.notDigit}")
@pl.edu.amu.rest.ApiParam(value = "Offer id from database.", required = true)
@pl.edu.amu.rest.PathParam(value = "offerId")
java.lang.String offerId) {
    pl.edu.amu.rest.model.Bid bid = getDatabase().getHighestBid(offerId);
    return bid;
}