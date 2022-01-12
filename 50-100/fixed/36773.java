public edu.warbot.models.Account createAccount() {
    return new edu.warbot.models.Account(getEmail(), getPassword(), firstName, lastName, screenName, false, false, new java.util.Date(), null, new java.util.Date(), "ROLE_USER", new java.util.HashSet<edu.warbot.models.Party>(), new java.util.HashSet<edu.warbot.models.Party>());
}