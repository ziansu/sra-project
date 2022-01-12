public message.MessageUpdate withSwitch(battle.Battle battle, pokemon.ActivePokemon active) {
    this.switchPokemon = true;
    this.type = active.getDisplayType(battle);
    this.shiny = active.isShiny();
    this.pokemon = active.getPokemonInfo();
    this.name = active.getName();
    this.gender = active.getGender();
    this.animation = false;
    return this.withFrontPokemon(active);
}