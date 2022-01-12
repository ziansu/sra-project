@java.lang.Override
protected java.util.Optional<java.util.UUID> getSenderUserAnonymizedId(nu.yona.server.subscriptions.service.UserDto actingUser, nu.yona.server.messaging.entities.Message messageEntity) {
    nu.yona.server.messaging.entities.BuddyMessage buddyMessageEntity = ((nu.yona.server.messaging.entities.BuddyMessage) (messageEntity));
    if (actingUser.getId().equals(buddyMessageEntity.getSenderUserId())) {
        return java.util.Optional.of(actingUser.getPrivateData().getUserAnonymizedId());
    }
    return messageEntity.getRelatedUserAnonymizedId();
}