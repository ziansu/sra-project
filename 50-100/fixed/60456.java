public message.MessageUpdate updatePokemon(battle.Battle b, pokemon.ActivePokemon pokemon) {
    if (b == null) {
        return this;
    }
    boolean isPlayer = pokemon.isPlayer();
    return this.withType(pokemon.getDisplayType(b), isPlayer).withNameChange(pokemon.getName(), isPlayer).withGender(pokemon.getGender(), isPlayer).withFrontPokemon(b, pokemon);
}