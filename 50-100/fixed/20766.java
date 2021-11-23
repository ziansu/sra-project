public void advance() {
    if (type.isMegaEvolution())
        type = ch.aiko.pokemon.pokemons.PokeUtil.get(((type.getChild().getPokedexNumber()) + 1));
    else
        type = ch.aiko.pokemon.pokemons.PokeUtil.get(((type.getPokedexNumber()) + 1));
    
    animation = new ch.aiko.pokemon.graphics.GIFAnimation(ch.aiko.pokemon.pokemons.PokeUtil.getAnimation(type, holder), 0, 0);
}