private java.util.ArrayList<games.Pandemie.applicationLogic.Action> getAllEventCardActions() {
    java.util.ArrayList<games.Pandemie.applicationLogic.Action> actions = new java.util.ArrayList<games.Pandemie.applicationLogic.Action>();
    java.util.ArrayList<games.Pandemie.applicationLogic.EventCard> eventCardsOnHand = new java.util.ArrayList<games.Pandemie.applicationLogic.EventCard>();
    for (games.Pandemie.applicationLogic.player.Player p : currentBoardState.getPlayers()) {
        for (games.Pandemie.applicationLogic.Card c : p.getHandCardArray()) {
            if ((c.getClass()) == (games.Pandemie.applicationLogic.EventCard.class)) {
                eventCardsOnHand.add(((games.Pandemie.applicationLogic.EventCard) (c)));
            }
        }
    }
    return actions;
}