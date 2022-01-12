public fr.univavignon.pokedex.api.PokemonMetadata getPokemonMetadataFromJSONObject(org.json.JSONObject data) throws org.json.JSONException {
    fr.univavignon.pokedex.api.PokemonMetadata pokemonMetadata;
    pokemonMetadata = new fr.univavignon.pokedex.api.PokemonMetadata(((data.getInt("PkMn")) + 1), data.getString("Identifier"), data.getInt("BaseAttack"), data.getInt("BaseDefense"), data.getInt("BaseStamina"));
    return pokemonMetadata;
}