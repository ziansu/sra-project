private void addAuthorIfAppropriate(final org.eurekastreams.server.domain.stream.StreamEntityDTO entity, final long actorId, final java.util.Collection<java.lang.Long> recipients) {
    if (((entity != null) && (EntityType.PERSON.equals(entity.getType()))) && (actorId != (entity.getId()))) {
        recipients.add(entity.getId());
    }
}