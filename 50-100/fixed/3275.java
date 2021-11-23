private void handleDodge(com.pokegoapi.api.gym.Battle.BattleHandler handler, com.pokegoapi.api.gym.Battle.ServerAction action) {
    if ((action.getAttackerIndex()) == 0) {
        com.pokegoapi.api.gym.Battle.BattlePokemon pokemon = activeAttacker;
        int duration = action.getDuration();
        handler.onDodge(api, this, pokemon, duration, action);
    }
}