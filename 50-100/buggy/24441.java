public void removeUser(User user) {
    Game game;
    if ((game = user.getGame()) != null)
        game.removeUser(user);
    
    clientList.remove(user);
    if (hasObserver)
        java.lang.System.out.println(("Client removed: " + (user.getName())));
    
}