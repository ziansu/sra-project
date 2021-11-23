@org.junit.Test
public void testBallot() {
    cn.edu.upc.yb.integrate.ballot.model.Ballot ballot = ballotRepository.save(new cn.edu.upc.yb.integrate.ballot.model.Ballot());
    cn.edu.upc.yb.integrate.ballot.model.Ticket ticket = new cn.edu.upc.yb.integrate.ballot.model.Ticket();
    ticket.setBallot(ballot);
    ticketRepository.save(ticket);
    ballotService.deleteBallot(4);
}