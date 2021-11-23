public gameEngine.Pokemon getPokemon(java.lang.String name) {
    gameEngine.Pokemon p = new gameEngine.Pokemon(this);
    for (int x = 0; x < (pokemonDB.size()); x++) {
        p = ((gameEngine.Pokemon) (pokemonDB.get(x)));
        if (p.name.toLowerCase().equals(name.toLowerCase())) {
            return p;
        }
    }
    return null;
}