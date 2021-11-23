public PokemonSpecies findCaughtSpeciesData(java.lang.String speciesName) throws PokedexException {
    for (int i = 0; i < (pokedex.size()); i++) {
        PokemonSpecies poke = pokedex.get(i);
        if (poke.getSpeciesName().equals(speciesName)) {
            if (!(poke.isEmpty())) {
                return poke;
            }
        }else {
            throw new PokedexException(Config.UNSEEN_POKEMON);
        }
    }
    throw new PokedexException(Config.UNCAUGHT_POKEMON);
}