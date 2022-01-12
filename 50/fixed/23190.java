public void deal(int turn) {
    java.util.ArrayList<Card> temp = players.get(turn);
    temp.add(deck.get(0));
    deck.remove(0);
    players.set(turn, temp);
}