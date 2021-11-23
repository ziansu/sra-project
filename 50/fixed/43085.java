public static me.corriekay.pokegoutil.utils.pokemon.PokemonPerformanceStats getStats(final POGOProtos.Enums.PokemonIdOuterClass.PokemonId pokemonId) {
    return me.corriekay.pokegoutil.utils.pokemon.PokemonPerformanceCache.MAP.get(pokemonId);
}