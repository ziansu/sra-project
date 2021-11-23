public static boolean drawTrainCard(TicketToRide.Model.Player player, TicketToRide.Model.TrainCard card) {
    java.util.List<TicketToRide.Model.TrainCard> faceUpCard = TicketToRide.Model.Deck.trainFaceUpCards;
    java.util.List<TicketToRide.Model.TrainCard> faceDownCard = TicketToRide.Model.Deck.trainCardsDeck;
    if (faceUpCard.contains(card)) {
        player.getTrainCards().add(faceUpCard.remove(faceUpCard.indexOf(card)));
        if ((faceDownCard.size()) > 0)
            faceUpCard.add(faceDownCard.remove(0));
        
        return true;
    }
    return false;
}