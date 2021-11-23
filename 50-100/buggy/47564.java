public java.util.List<ohtuesimerkki.Player> topScorers(int howMany) {
    java.util.Collections.sort(players);
    java.util.ArrayList<ohtuesimerkki.Player> topScorers = new java.util.ArrayList<ohtuesimerkki.Player>();
    java.util.Iterator<ohtuesimerkki.Player> playerIterator = players.iterator();
    while (howMany >= 0) {
        topScorers.add(playerIterator.next());
        howMany--;
    } 
    return topScorers;
}