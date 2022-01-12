public void placeLakeTile(int id) {
    hf.game.items.LakeTile lake = entities.get(id).getLake();
    if (((id == 221) && (lake != null)) && (!(lake.isFaceUp()))) {
        placeStartLake(lake);
    }else {
        if (((selectedCard) != null) && ((selectedCard.getCardType()) == (hf.game.common.CardType.LAKETILE)))
            placeNewLake(((hf.game.items.LakeTile) (selectedCard)), id);
        
    }
}