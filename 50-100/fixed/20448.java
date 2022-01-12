public java.lang.String seenPokemonMenu() {
    java.lang.String encountered = "";
    for (int i = 0; i < (pokedex.size()); i++) {
        encountered += (pokedex.get(i).getSpeciesName()) + "\n";
    }
    return encountered;
}