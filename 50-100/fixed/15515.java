private void handleFaint(com.pokegoapi.api.gym.Battle.BattleHandler handler, com.pokegoapi.api.gym.Battle.ServerAction action) {
    com.pokegoapi.api.gym.Battle.BattlePokemon pokemon = null;
    if ((action.getAttackerIndex()) == 0) {
        pokemon = activeAttacker;
    }else
        if ((action.getAttackerIndex()) == 0) {
            pokemon = activeAttacker;
        }else {
            return ;
        }
    
    int duration = action.getDuration();
    handler.onFaint(api, this, pokemon, duration, action);
    faintedPokemon.add(pokemon.getPokemon().getId());
}