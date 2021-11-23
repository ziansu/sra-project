public void discardItemCard(it.polimi.ingsw.cg_23.model.players.Player player, it.polimi.ingsw.cg_23.model.cards.Card card) {
    for (it.polimi.ingsw.cg_23.model.cards.Card playerCard : player.getCards()) {
        if ((playerCard.getClass()) == (card.getClass())) {
            player.getCards().remove(playerCard);
            match.getItemDeckDiscarded().add(playerCard);
            player.setHasFourCard(false);
            break;
        }
    }
}