public net.anomalyxii.werewolves.parser.PlayerInstance instanceForUser(net.anomalyxii.werewolves.parser.User user) {
    java.lang.Character character = getCharacterFor(user);
    if (character == null)
        return new net.anomalyxii.werewolves.parser.UserInstance(user);
    
    return instanceForCharacter(character);
}