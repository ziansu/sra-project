private void handleDodge(com.pokegoapi.api.gym.Battle.BattleHandler handler, com.pokegoapi.api.gym.Battle.ServerAction action) {
    com.pokegoapi.api.gym.Battle.BattlePokemon pokemon = getActivePokemon(action.getAttackerIndex(), true);
    if ((action.getAttackerIndex()) == 0) {
        pokemon = activeAttacker;
    }
    int duration = action.getDuration();
    handler.onDodge(api, this, pokemon, duration, action);
}