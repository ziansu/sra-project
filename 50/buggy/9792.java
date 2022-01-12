@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = "text/plain")
public java.lang.String addCardToCommonDesk(org.phase.game.entities.Card cards) {
    this.card = new org.phase.game.entities.Card(cards.getOwner(), cards.getType(), cards.getMark());
    return "HAHAHAHA";
}