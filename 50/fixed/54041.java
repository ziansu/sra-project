public void assignVitalityToUser(net.anomalyxii.werewolves.parser.User user, net.anomalyxii.werewolves.parser.Vitality vitality) {
    if (user == null)
        throw new java.lang.IllegalArgumentException("User cannot be null");
    
    java.lang.Character character = getCharacterFor(user);
    assignVitalityToCharacter(character, vitality);
}