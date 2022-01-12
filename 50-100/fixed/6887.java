public PokemonSpecies findCaughtSpeciesData(java.lang.String speciesName) throws PokedexException {
    for (int i = 0; i < (pokedex.size()); i++) {
        PokemonSpecies poke = pokedex.get(i);
        if (poke.getSpeciesName().equals(speciesName)) {
            if (poke.isEmpty()) {
                throw new PokedexException(Config.UNCAUGHT_POKEMON);
            }else {
                return poke;
            }
        }
    }
    throw new PokedexException(Config.UNSEEN_POKEMON);
}