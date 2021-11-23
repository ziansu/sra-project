public java.lang.String seenPokemonMenu() {
    java.lang.String encountered = "";
    for (int i = 0; i < (pokedex.size()); i++) {
        encountered += "\n" + (pokedex.get(i).getSpeciesName());
    }
    return encountered;
}