@java.lang.Override
public void ticketSubmitError(com.iluwatar.hexagonal.domain.PlayerDetails details) {
    org.bson.Document document = new org.bson.Document("email", details.getEmail());
    document.put("phone", details.getPhoneNumber());
    document.put("bank", details.getBankAccount());
    document.put("message", java.lang.String.format("Lottery ticket could not be submitted because lack of funds."));
    eventsCollection.insertOne(document);
    stdOutEventLog.ticketSubmitError(details);
}