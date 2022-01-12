public net.anomalyxii.werewolves.parser.PlayerInstance instanceForCharacter(java.lang.Character character) {
    net.anomalyxii.werewolves.parser.Vitality vitality = getVitalityForCharacter(character);
    net.anomalyxii.werewolves.parser.User user = getUserFromCharacter(character);
    if (isCharacterBeingControlled(character)) {
        net.anomalyxii.werewolves.parser.User controllingUser = getUserControlling(character);
        return new net.anomalyxii.werewolves.parser.CharacterControlledInstance(character, controllingUser, user, vitality);
    }
    return new net.anomalyxii.werewolves.parser.CharacterInstance(character, user, vitality);
}