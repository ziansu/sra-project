public java.lang.String draw(entity.Player player) {
    entity.ChanceCard temp = chanceCardDeck.get(0);
    if (temp.isOwnable()) {
        temp.setOwner(player);
        player.giveCard(temp);
    }else {
        chanceCardDeck.add(temp);
    }
    chanceCardDeck.remove(0);
    return temp.toString();
}