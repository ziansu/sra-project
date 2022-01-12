public com.saxion.nl.retroapptive.model.Reaction getReactionFromDomainObject(com.saxion.nl.retroapptive.communication.data.gatherer.isis.applib.representation.DomainObject domainObject) {
    com.saxion.nl.retroapptive.model.Item item = getItemFromDomainObject(domainObject);
    java.util.Map<java.lang.String, com.saxion.nl.retroapptive.communication.data.gatherer.isis.applib.representation.ObjectMember> members = domainObject.getMembers();
    com.saxion.nl.retroapptive.model.Reaction reaction = new com.saxion.nl.retroapptive.model.Reaction(item);
    java.lang.Integer priority = null;
    if (!(members.get("points").getValue().isNull())) {
        priority = java.lang.Integer.parseInt(members.get("points").getValue().asText());
    }
    reaction.setPriority(priority);
    return reaction;
}