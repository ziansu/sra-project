public pokedex.Pokemon createPokemon(java.lang.String name, int level) {
    return new pokedex.Pokemon(pokemonData.get(name), level);
}