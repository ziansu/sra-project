public net.anomalyxii.werewolves.parser.User findOrCreateUser(java.lang.String name, java.lang.String avatarUrl) {
    net.anomalyxii.werewolves.parser.User instance = findUser(name);
    if (instance != null)
        return instance;
    
    java.net.URI uri = (avatarUrl != null) ? java.net.URI.create(avatarUrl) : null;
    net.anomalyxii.werewolves.parser.User user = new net.anomalyxii.werewolves.parser.User(name, uri);
    players.add(user);
    users.put(name, user);
    return user;
}