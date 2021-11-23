@java.lang.Override
public model.enums.PlayerAction trainerCanBePlayedFromHand() {
    if ((!(getBasicPokemonInHand().isEmpty())) && ((gameModel.getFullBenchPositions(getCardOwner().getColor()).size()) < 5))
        return model.enums.PlayerAction.PLAY_TRAINER_CARD;
    
    return null;
}