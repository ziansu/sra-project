public static TicketToRide.Model.TrainCard drawTrainCard(TicketToRide.Model.Player player, int index) {
    java.util.List<TicketToRide.Model.TrainCard> faceUpCard = TicketToRide.Model.Deck.trainFaceUpCards;
    java.util.List<TicketToRide.Model.TrainCard> faceDownCard = TicketToRide.Model.Deck.trainCardsDeck;
    TicketToRide.Model.TrainCard card = faceUpCard.remove(index);
    if ((faceDownCard.size()) > 0)
        faceUpCard.add(faceDownCard.remove(0));
    
    return card;
}