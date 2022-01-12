public net.anomalyxii.werewolves.parser.PlayerInstance instanceFor(net.anomalyxii.werewolves.domain.Player player) {
    if (player == (net.anomalyxii.werewolves.domain.Player.MODERATOR))
        return PlayerInstance.MODERATOR;
    
    if (player == (net.anomalyxii.werewolves.domain.Player.ANONYMOUS))
        return PlayerInstance.ANONYMOUS;
    
    if (player instanceof net.anomalyxii.werewolves.parser.User)
        return instanceForUser(((net.anomalyxii.werewolves.parser.User) (player)));
    
    if (player instanceof java.lang.Character)
        return instanceForCharacter(((java.lang.Character) (player)));
    
    return null;
}