public java.lang.String caughtPokemonMenu() {
    java.lang.String caught = "";
    for (int i = 0; i < (pokedex.size()); i++) {
        PokemonSpecies species = pokedex.get(i);
        if (!(species.isEmpty())) {
            caught += "\n" + (species.getSpeciesName());
        }
    }
    return caught;
}