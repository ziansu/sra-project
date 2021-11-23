@java.lang.Override
public data.Player update(data.Player updatedPlayer, int id) {
    data.Player managedPlayer = em.find(data.Player.class, id);
    managedPlayer.setDisplayName(updatedPlayer.getDisplayName());
    managedPlayer.setEmail(updatedPlayer.getEmail());
    managedPlayer.setFriends(updatedPlayer.getFriends());
    managedPlayer.setPassword(updatedPlayer.getPassword());
    managedPlayer.setQuests(updatedPlayer.getQuests());
    return managedPlayer;
}