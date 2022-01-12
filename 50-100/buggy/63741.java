private void generateRandomPlayer() {
    java.util.Random rand = new java.util.Random();
    for (int i = rand.nextInt(settings.getMaxPlayers()); i > 0; i--)
        currentPlayer = currentPlayerIt.next();
    
    if (!(currentPlayerIt.hasNext()))
        currentPlayerIt = state.getPlayers().listIterator();
    
    currentPlayer = currentPlayerIt.next();
}