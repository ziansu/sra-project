private void showGames(Server.ClientThread thread) {
    java.util.ArrayList<java.lang.String> availableGames = new java.util.ArrayList<java.lang.String>();
    for (java.util.Map.Entry<java.lang.String, Game> entry : gameList.entrySet())
        if (!(entry.getValue().getGameStarted()))
            availableGames.add(entry.getKey());
        
    
    Tuple tuple = new Tuple(Tuple.SHOWGAMES);
    tuple.put(availableGames);
    thread.sendData(tuple);
}