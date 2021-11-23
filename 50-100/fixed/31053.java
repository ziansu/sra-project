@java.lang.Override
public data.Player update(data.Player updatedPlayer, int id) {
    data.Player managedPlayer = em.find(data.Player.class, id);
    managedPlayer.setDisplayName(updatedPlayer.getDisplayName());
    managedPlayer.setEmail(updatedPlayer.getEmail());
    managedPlayer.setPassword(updatedPlayer.getPassword());
    return managedPlayer;
}