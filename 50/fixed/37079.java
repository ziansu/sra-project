public void throwExceptionIfBlocked(com.jfonzuer.entities.User sender, com.jfonzuer.entities.User target) {
    if (((target.getBlockedUsers()) != null) && (target.getBlockedUsers().contains(sender))) {
        throw new java.lang.IllegalArgumentException("Vous ne pouvez pas envoyer de message à cet utilisateur");
    }
}