public int getCandiesFromFamily(POGOProtos.Enums.PokemonIdOuterClass.PokemonId pokemonID) {
    java.util.List<com.pokegoapi.api.pokemon.Pokemon> myFamily = getFullFamily(pokemonID);
    if (myFamily.isEmpty()) {
        return 0;
    }else {
        return myFamily.get(0).getCandy();
    }
}