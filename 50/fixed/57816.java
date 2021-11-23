public net.anomalyxii.werewolves.domain.Player findUserOrSpecialPlayer(java.lang.String name) {
    net.anomalyxii.werewolves.domain.Player instance = findSpecialPlayer(name);
    if (instance != null)
        return instance;
    
    return findUser(name);
}